package JavaFundamentals;

import java.util.Scanner;

public class EJEEPTICKETTRY {

	public static void main(String[] args) {
//NOTE:THIS PROGRAM CREATED BY REYBEEN ROMERO  "1yr-BS Computer Science"
//NOTE:THIS PROGRAM CREATED BY REYBEEN ROMERO  "1yr-BS Computer Science"		
		
		Scanner s = new Scanner(System.in);
		String Plate_No;
		String Bus_No;
		String Transaction_ID;
		String Date; 
		String Time;
		String Route;
		String Origin ;
		String Destination;
		String Fare_Type;
		
		System.out.println("-----FHMPTSC------");
		System.out.println();
		System.out.println("---TRANSACTION_SLIP---");
		System.out.println();
		
		System.out.print("Plate No: " );
		Plate_No = s.nextLine();
		
		System.out.print("Bus No: " );
		Bus_No = s.nextLine();
		
		System.out.print("Transaction ID: ");
		Transaction_ID = s.nextLine();
		
		System.out.print("Date: " );
		Date = s.nextLine();
		
		System.out.print("Time: " );
		Time = s.nextLine();
		
		System.out.print("Route: " );
		Route = s.nextLine();
		
		System.out.print("Origin: " );
		Origin = s.nextLine();
		
		System.out.print("Destination: " );
		Destination = s.nextLine();
		
		System.out.print("Fare Type: " );
		Fare_Type = s.nextLine();
		
		System.out.print("PHP 11.80 ");
		
		System.out.println();
		System.out.println();
		System.out.println("---keep this ticket for inspection---");
	}

}
