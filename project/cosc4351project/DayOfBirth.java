package cosc4351project;

import java.util.Scanner;
import java.time.LocalDate;
	
public class birth {
	
	public static int yearcheck(int x, Scanner in ){
		if (x > 2017)
		{
			System.out.println("Invalid year, please enter a value less than 2017 that is a number of 4 digits XXXX... ");
			System.out.println("Please enter the year you were born: ");
			while (!in.hasNextInt()) {
		        System.out.println("That's not a number! Try again...");
		        in.next();
		    }
			x = in.nextInt();
			yearcheck(x, in);
		}
		return x;
	}
	
	
	public static int monthcheck(String sc, Scanner in){		
		System.out.println("Sorry thats an invalid month!... please try again..");
		System.out.println("Please enter the month you were born: ");
		sc = in.next();
		sc = sc.toLowerCase();
		
		int month = 0;
		if ("january".equals(sc) || "January".equals(sc) || "1".equals(sc) || "01".equals(sc))
		{
			month = 01;
			
		}
		else if("february".equals(sc) || "February".equals(sc) || "2".equals(sc) || "02".equals(sc))
		{
			month = 02;
			
		}
		else if("march".equals(sc) || "March".equals(sc) || "3".equals(sc) || "03".equals(sc))
		{
			month = 03;
			
		}
		else if("april".equals(sc) || "April".equals(sc) || "4".equals(sc) || "04".equals(sc))
		{
			month = 04;
			
		}
		else if("may".equals(sc) || "May".equals(sc) || "5".equals(sc) || "05".equals(sc))
		{
			month = 05;
			
		}
		else if("june".equals(sc) || "June".equals(sc) || "6".equals(sc) || "06".equals(sc))
		{
			month = 06;
			
		}
		else if("july".equals(sc) || "July".equals(sc) || "7".equals(sc) || "07".equals(sc))
		{
			month = 07;
			
		}
		else if("august".equals(sc) || "August".equals(sc) || "8".equals(sc) || "08".equals(sc))
		{
			month = 8;
			
		}
		else if("september".equals(sc) || "September".equals(sc) || "9".equals(sc) || "09".equals(sc))
		{
			month = 9;
			
		}
		else if("october".equals(sc) || "October".equals(sc) || "10".equals(sc))
		{
			month = 10;
			
		}
		else if("november".equals(sc) || "November".equals(sc)|| "11".equals(sc))
		{
			month = 11;
			
		}
		else if("december".equals(sc) || "December".equals(sc) || "12".equals(sc))
		{
			month = 12;
			
		}
		else
		{
			monthcheck(sc, in);
		}
		return month;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter all fields!");
		
		System.out.println("Please enter the year you were born: ");
		while (!scan.hasNextInt()) {
	        System.out.println("That's not a number! Try again...");
	        scan.next();
	    }
		int year = scan.nextInt();
		year = yearcheck(year, scan);
		
		System.out.println("Please enter the month you were born: ");
		String sc = scan.next();
		sc = sc.toLowerCase();
		
		int month = 0;
		if ("january".equals(sc) || "January".equals(sc) || "1".equals(sc) || "01".equals(sc))
		{
			month = 01;
			
		}
		else if("february".equals(sc) || "February".equals(sc) || "2".equals(sc) || "02".equals(sc))
		{
			month = 02;
			
		}
		else if("march".equals(sc) || "March".equals(sc) || "3".equals(sc) || "03".equals(sc))
		{
			month = 03;
			
		}
		else if("april".equals(sc) || "April".equals(sc) || "4".equals(sc) || "04".equals(sc))
		{
			month = 04;
			
		}
		else if("may".equals(sc) || "May".equals(sc) || "5".equals(sc) || "05".equals(sc))
		{
			month = 05;
			
		}
		else if("june".equals(sc) || "June".equals(sc) || "6".equals(sc) || "06".equals(sc))
		{
			month = 06;
			
		}
		else if("july".equals(sc) || "July".equals(sc) || "7".equals(sc) || "07".equals(sc))
		{
			month = 07;
			
		}
		else if("august".equals(sc) || "August".equals(sc) || "8".equals(sc) || "08".equals(sc))
		{
			month = 8;
			
		}
		else if("september".equals(sc) || "September".equals(sc) || "9".equals(sc) || "09".equals(sc))
		{
			month = 9;
			
		}
		else if("october".equals(sc) || "October".equals(sc) || "10".equals(sc))
		{
			month = 10;
			
		}
		else if("november".equals(sc) || "November".equals(sc)|| "11".equals(sc))
		{
			month = 11;
			
		}
		else if("december".equals(sc) || "December".equals(sc) || "12".equals(sc))
		{
			month = 12;
			
		}
		else 
		{
			month = monthcheck(sc, scan);
		}

		
		System.out.println("Please enter the day you were born: ");
		String sc2 = scan.next();
		sc2 = sc2.toLowerCase();

		
		int day = 0;
		if ("one".equals(sc2) || "1".equals(sc2) || "01".equals(sc2))
		{
			day = 01;
			
		}
		else if("two".equals(sc2) || "2".equals(sc2) || "02".equals(sc2))
		{
			day = 02;
			
		}
		else if("three".equals(sc2) || "3".equals(sc2) || "03".equals(sc2))
		{
			day = 03;
			
		}
		else if("four".equals(sc2) || "4".equals(sc2) || "04".equals(sc2))
		{
			day = 04;
			
		}
		else if("five".equals(sc2) || "5".equals(sc2) || "05".equals(sc2))
		{
			day = 05;
			
		}
		else if("six".equals(sc2) || "6".equals(sc2) || "06".equals(sc2))
		{
			day = 06;
			
		}
		else if("seven".equals(sc2) || "7".equals(sc2) || "07".equals(sc2))
		{
			day = 07;
			
		}
		else if("eight".equals(sc2) || "8".equals(sc2) || "08".equals(sc2))
		{
			day = 8;
			
		}
		else if("nine".equals(sc2) || "9".equals(sc2) || "09".equals(sc2))
		{
			day = 9;
			
		}
		else if("ten".equals(sc2) || "10".equals(sc2))
		{
			day = 10;
			
		}
		else if("eleven".equals(sc2) || "11".equals(sc2))
		{
			day = 11;
			
		}
		else if("twelve".equals(sc2) || "12".equals(sc2))
		{
			day = 12;
			
		}
		else 
		{
			day = Integer.parseInt(sc2);
		}
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		System.out.println("You were born on a " + birthDate.getDayOfWeek());

		scan.close();
	}
}
