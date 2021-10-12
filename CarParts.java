class CarParts{
	
	String company="Mahindra";
	CarSpareParts parts=CarSpareParts.ALLOYWHEEL;
	float price;
	int kmDriven;
	String name;
	
	CarParts(String company,float price)
	{
		this();
		this.price=price;
		System.out.println("invoked string,float const of carparts");
		
	}
	CarParts()
	{
		System.out.println("invoked no arg const of a carparts");
		this.company="Porshe";
		this.price=2500000.0f;
	}
	CarParts(String name)
	{
		this.name=name;
		System.out.println("invoked string const of carparts");
	}
	CarParts(float price)
	{
		this.price=price;
		System.out.println("invoked float const of carparts");
	}	
	
}