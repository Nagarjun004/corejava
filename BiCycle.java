class BiCycle{
	String color;
	float price;
	String brand;
	
	BicycleType name=BicycleType.ROADBIKE;



	BiCycle(String color,float price,String brand)
	{
		System.out.println("invoked cons location String,float");
		this.color=color;
		this.price=price;
		this.brand=brand;
	}
	void brake()
	{
		System.out.println("invoked brake");
	}
	void move()
	{
		System.out.println("invoked move");
	}
	void displayDetails()
	{
		System.out.println("invoked displayDetails");
		System.out.println("Bicycle color :"+this.color);
		System.out.println("Bicycle price :"+this.price);
		System.out.println("Bicycle brand :"+this.brand);
		System.out.println("Bicycle type :"+this.name);
	}
} 