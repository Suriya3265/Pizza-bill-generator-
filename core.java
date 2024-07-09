package BillGenerator;

import java.sql.SQLException;
import java.util.Scanner;

public class core {
	public static void main(String args[]) throws SQLException
	{
		
		int aa=1;
		Scanner sc=new Scanner(System.in);
		while(aa==1)
		{
			System.out.println("enter 1 to order");
			aa=sc.nextInt();
			if(aa==1) {
				System.out.println("Enter 1 to normal Pizza and 2 to Delux Pizza");
			int pix=sc.nextInt();
			assign as=new assign();
			if(pix==2) {
				DeluxPizza dp=new DeluxPizza(false);
			}
			
			
			
			}
			
			
			
			
			
			
		}
	}	
}
	
