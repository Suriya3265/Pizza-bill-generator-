package BillGenerator;

import java.util.Scanner;

public class DeluxPizza extends Pizza{
	Scanner sc=new Scanner(System.in);
	public DeluxPizza(boolean veg){
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
		
		System.out.println("enter 1 to paking");
		int a=sc.nextInt();
		if (a==1) {
			super.takeAway();
		}
				
		
		
		super.getBill();
	}

	@Override
	public void addExtraCheese() {}

	@Override
	public void addExtraToppings() {}
	
	
	
}
