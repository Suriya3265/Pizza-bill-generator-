package BillGenerator;

import java.sql.SQLException;
import java.util.Scanner;

public class assign {
	boolean vegg;
	public assign() throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to veg and 2 to nonveg");
		int veg=sc.nextInt();
			
		if(veg==1) {
			 vegg=true;
		}
		else {
			 vegg=false;
		}
			
		Pizza pz=new Pizza(vegg);
		
		System.out.println("enter 1 to add extra cheese and 2 to add toppings ");
		int add=sc.nextInt();
			
		if(add==1) {
			
		    pz.addExtraCheese();
         	
			}
		else if(add==2) {
			pz.addExtraToppings();
		}
		else if(add==12) {
			pz.addExtraCheese();
			pz.addExtraToppings();
		}
		else{
			
		}
		
		pz.getBill();
		connecting cc=new connecting();
		cc.updateorder(pz);
	//	cc.displayinfo();
		
	}

}
