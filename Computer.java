class Computer{
	
	String brand="Dell";
	int modelNo=4837897;
	double price=69.0;
	int quantity=3;
	static double totalOfAll;
	
	ComputerType type=ComputerType.WORKSTATION;
	Computer()
	{
		System.out.println("invoked computer");
	}
	
	void displayDetails()
	{
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	void displayTotalPrice()
	{
		System.out.println("invoked displayTotalPrice");
		double totalPrice=this.price*this.quantity;
		System.out.println(totalPrice);
		Computer.totalOfAll=Computer.totalOfAll+totalPrice;
		System.out.println(Computer.totalOfAll);
	}
	void displayTotalOfAll()
	{
		System.out.println("invoked display total of all");
		System.out.println(Computer.totalOfAll);
	}
}