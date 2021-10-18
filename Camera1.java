class Camera1{
	
	String brand;
	int model;
	float pixel;
	double price;
	boolean four k;
	
	Camera1(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("created camera using String,double");
	}
	String getBrand()
	{
		return this.brand;
	}
	double getPrice()
	{
		return this.price;
	}
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
}