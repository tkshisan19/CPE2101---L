/*
============================================================================
 FILE        : LE41_FruitJuiceMachineGUI.java
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program simulates a fruit juice vending machine using a GUI.
               Users can select a juice type, specify quantity, deposit payment,
               and receive change. The system tracks inventory and cash balance.
 COPYRIGHT   : October 12, 2025
============================================================================
*/




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class CashRegister {
    private int cashOnHand;

    CashRegister() {
        this.cashOnHand = 500;
    }

    CashRegister(int cashIn) {
        this.cashOnHand = cashIn;
    }

    public int getCurrentBalance() {
        return cashOnHand;
    }

    public void acceptAmount(int amountIn) {
        this.cashOnHand += amountIn;
    }
}




class DispenserType {
    private int numberOfItems;
    private int cost;

    DispenserType() {
        this.numberOfItems = 0;
        this.cost = 0;
    }

    DispenserType(int setNoOfItems, int setCost) {
        this.numberOfItems = setNoOfItems;
        this.cost = setCost;
    }

    public int getNoOfItems() {
        return numberOfItems;
    }

    public int getCost() {
        return cost;
    }

    public void makeSale() {
        if (this.numberOfItems > 0) {
            this.numberOfItems--;
        }
    }
}



public class LE41_FruitJuiceMachineGUI extends JFrame {
    private static CashRegister cashRegister = new CashRegister();
    private static DispenserType[] dispenserType = new DispenserType[4];
    static String[] items = { "Apple Juice", "Orange Juice", "Mango Lassi", "Fruit Punch" };

    public LE41_FruitJuiceMachineGUI() {
        setTitle("Juice Machine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));  // 4 items + Exit button

        for (int i = 0; i < dispenserType.length; i++) {
            JButton button = new JButton(items[i] + " - " + dispenserType[i].getCost() + " pesos");
            final int index = i;
            button.addActionListener(e -> handleSelection(index + 1));  // 1-based index
            panel.add(button);
        }

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Thank you for using the Juice Machine. Have a great day ahead!\nCurrent cash Register Balance: " + cashRegister.getCurrentBalance() + " pesos");
            System.exit(0);
        });
        panel.add(exitButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    
    private void handleSelection(int selection) {
        String input = JOptionPane.showInputDialog(this, "How many servings of " + items[selection - 1] + " do you need?");
        int numOfItems = Integer.parseInt(input);  // Simple parsing; add error handling in production
        sellProduct(selection, numOfItems);
    }

    
    public static void sellProduct(int selection, int numOfItems) {
        if (selection >= 1 && selection <= dispenserType.length) {
            DispenserType selectedDispenser = dispenserType[selection - 1];
            if (selectedDispenser.getNoOfItems() >= numOfItems) {  // Check if enough items are available
                int productCost = numOfItems * selectedDispenser.getCost();
                JOptionPane.showMessageDialog(null, "For " + numOfItems + " servings of " + items[selection - 1] + ", the total cost is " + productCost + " pesos.");
                
                int depositedAmount = 0;
                int tries = 0;
                
                while (depositedAmount < productCost && tries < 2) {
                    String inputStr = JOptionPane.showInputDialog(null, "Please deposit the required amount (" + (productCost - depositedAmount) + " pesos remaining):");
                    int deposit = Integer.parseInt(inputStr);  // Simple parsing
                    depositedAmount += deposit;
                    
                    int remainingBalance = productCost - depositedAmount;
                    
                    if (remainingBalance > 0) {
                        JOptionPane.showMessageDialog(null, "You still need to deposit " + remainingBalance + " more pesos.");
                    } else {
                        int change = depositedAmount - productCost;
                        cashRegister.acceptAmount(depositedAmount);
                        cashRegister.acceptAmount(-change);  // Correcting for change
                        
                        for (int i = 1; i <= numOfItems; i++) {
                            selectedDispenser.makeSale();
                        }
                        
                        JOptionPane.showMessageDialog(null, "Purchase successful! Change returned: " + change + " pesos");
                        JOptionPane.showMessageDialog(null, "Enjoy your " + items[selection - 1] + "!");
                        break;
                    }
                    tries++;
                }
                
                if (tries >= 2) {
                    JOptionPane.showMessageDialog(null, "Transaction cancelled! Returning your money...");
                    cashRegister.acceptAmount(-depositedAmount);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sorry! Not enough " + items[selection - 1] + " available. Only " + selectedDispenser.getNoOfItems() + " left.");
            }
        }
    }

    
    
    
    public static void main(String[] args) {
        dispenserType[0] = new DispenserType(50, 80);
        dispenserType[1] = new DispenserType(50, 80);
        dispenserType[2] = new DispenserType(50, 80);
        dispenserType[3] = new DispenserType(50, 80);

        SwingUtilities.invokeLater(() -> new LE41_FruitJuiceMachineGUI());
    }
}
