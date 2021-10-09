class Scooter{
	
	String company="deo";
	int price=90000;
	float length;
	int kmDriven;
	byte milage=35;
	
	Scooter(String company)
	{
		System.out.println("Invoked scooter with no arg const");
		System.out.println(this);
		System.out.println(this.company);
		this.company=company;
		System.out.println("end of const");
	}
	Scooter(int price)
	{
		System.out.println("Invoked scooter with no arg const");
		System.out.println(this);
		System.out.println(this.price);
		this.price=price;
		System.out.println("end of const");
	}
	Scooter( float length)
	{
		System.out.println("Invoked scooter with no arg const");
		System.out.println(this);
		System.out.println(this.length);
		this.length=length;
		System.out.println("end of const");
	}
	Scooter(byte milage)
	{
		System.out.println("Invoked scooter with no arg const");
		System.out.println(this);
		System.out.println(this.milage);
		this.milage=milage;
		System.out.println("end of const");
	}
	
}