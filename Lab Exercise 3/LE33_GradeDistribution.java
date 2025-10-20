package LE33_GradeDistribution;

import java.util.Scanner;

public class LE33_GradeDistribution {
	private int aCount, bCount, cCount, dCount, fCount;
	
	public void setGrades(int a, int b, int c, int d, int f) {
		this.aCount = a;
		this.bCount = b;
		this.cCount = c;
		this.dCount = d;
		this.fCount = f;
	}
	
	
	public int getA() {
		return aCount;
	}
	
	
	public int getB() {
		return bCount;
	}
	
	
	public int getC() {
		return cCount;
	}
	
	
	public int getD() {
		return dCount;
	}
	
	
	public int getF() {
		return fCount;
	}
	
	
	
	public int getTotal() {
		return aCount + bCount + cCount + dCount + fCount;
	}
	
	
	
	private int getPercentage(int count) {
		if(getTotal() == 0) return 0;
		
		return(int) Math.round(((double) count/ getTotal()) * 100);
	}
	
	
	
	public void drawBarGraph() {
        System.out.println("\nGrade Distribution Bar Graph:");
        printBar("A", getPercentage(aCount));
        printBar("B", getPercentage(bCount));
        printBar("C", getPercentage(cCount));
        printBar("D", getPercentage(dCount));
        printBar("F", getPercentage(fCount));
    }
	
	
	private void printBar(String grade, int percent) {
		int stars = (int) Math.round(percent / 2.0);
		StringBuilder bar = new StringBuilder();
		
		for(int i = 0; i < stars; i++) {
			bar.append("*");
		}
		
		
		System.out.printf("%-2s (%3d%%): %s%n", grade, percent, bar.toString());
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LE33_GradeDistribution gd = new LE33_GradeDistribution();
		
		
		System.out.println("Enter Grade A: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter Grade B: ");
		int b = scanner.nextInt();
		
		System.out.println("Enter Grade C: ");
		int c = scanner.nextInt();
		
		System.out.println("Enter Grade D: ");
		int d = scanner.nextInt();
		
		System.out.println("Enter Grade F: ");
		int f = scanner.nextInt();
		
		
		gd.setGrades(a, b, c, d, f);
		
		
		System.out.println("\nTotal Grades: " + gd.getTotal());
		gd.drawBarGraph();
		
		
		scanner.close();
				
	}
}