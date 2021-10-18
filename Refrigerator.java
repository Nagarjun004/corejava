class Refrigerator{
	
	String company;
	int model;
	int capacityInLiters;
	boolean doubleDoor;
	double price;
	
	Refrigerator(String company,double price)
	{
		this.company=company;
		this.price=price;
		System.out.println("created Refrigerator using String,double");
		
	}
	String getCompany()
	{
		return this.company;
	}
	double getPrice()
	{
		return this.price;
	}
	void setCompany(String company)
	{
		this.company=company;
	}
	void setPrice(double price)
	{
		this.price=price;
	}

}