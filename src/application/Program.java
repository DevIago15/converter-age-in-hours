package application;

import java.util.Scanner;
import entities.Days;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Days day = new Days(0);
		
		
		System.out.print("Write your year-old: ");
		day.year = sc.nextInt();
		
		
		// making year-old in hours
		
		 int hours = 8760;
		 hours = hours * day.year;
		 
		 int days = 365;
		 days = days * day.year;
		 
		 int months = 12;
		 months = months * day.year;
		 
		 System.out.printf("With %d years, you already lived %d hours or %d days or %d months.", day.year, hours, days, months);
		
		sc.close();
	}

}