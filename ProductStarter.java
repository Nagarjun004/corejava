class ProductStarter{
	
	public static void main(String[] values)
	{
		Product product=new Product();
		product.displayDetails();
		product.name="laptop";
		product.price=69.0;
		product.quality=true;
		product.quantity=9;
		product.isiMark=true;
		product.displayDetails();
		
		Product product1=new Product();
		product1.name="Washing machine";
		product1.price=30.0;
		product1.quality=true;
		product1.quantity=1;
		product1.isiMark=true;
		product1.displayDetails();
		
		product.displayTotalPrice();
		product1.displayTotalPrice();
		
	}
}