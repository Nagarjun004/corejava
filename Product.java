class Product{
	
	boolean quality;
	double price;
	int quantity;
	boolean isiMark;
	String name;

	static double totalOfAllProduct;
	
	Product()
	{
		System.out.println("invoked product const");
	}
	void displayDetails()
	{
		System.out.println("invoked displaydetails");
		System.out.println(this.name);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.quality);
		System.out.println(this.isiMark);
	}
	
	void displayTotalPrice()
	{
		System.out.println("invoked displayTotalPrice");
		double totalPrice=this.price*this.quantity;
		System.out.println(totalPrice);
		Product.totalOfAllProduct=Product.totalOfAllProduct+totalPrice;
		System.out.println(Product.totalOfAllProduct);


	}


		
	
}