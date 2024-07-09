package BillGenerator;

public class Pizza {
	public int price;
	private boolean  veg;
	
	private int extraCheesePrice=100;
	private int extraToppings=150;
	private int backpack=50;
	public String Pizzza;
	private int basePizzaPrice;
	
	
	private boolean isextraToppings=false;
	private boolean isextraCheesePrice=false;
	private boolean isbackpack=false;
	
	public Pizza(boolean vegg){
		this.veg=vegg;
		if(this.veg) {
			this.price=300;
			Pizzza="veg pizza";
		}
		else {
			this.price=400;
			Pizzza="  Nonveg pizza";
		}
		basePizzaPrice=this.price;
		}
	
	
	
	public void getPizzaPrice() {
		System.out.println(this.price);
		
	}
	
	public void addExtraCheese() {
		isextraCheesePrice=true;
		
		this.price+=extraCheesePrice;
		
	}
	
	public void addExtraToppings(){
		isextraToppings=true;
		
		this.price+=extraToppings;
		
	}
	public void takeAway() {
		isbackpack=true;
		
		this.price+=backpack;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("Pizza:"+basePizzaPrice);
		if(isextraCheesePrice) {
			bill+="Extra Cheese added: "+extraCheesePrice+"\n";
			
		}
		if(isextraToppings) {
			bill+="Extra Toppings added: "+extraToppings+"\n";
			
		}
		if(isbackpack) {
			bill+="Take Away: "+backpack+"\n";
			
		}
	
	    bill+="Bill:  "+this.price+"\n";
	    System.out.println(bill);
	}
}
