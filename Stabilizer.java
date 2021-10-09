class Stabilizer{
	 
	 String brand="V guard";
	 int voltage=220;
	 String color;
	 float price=3500.0f;
	 byte number=10;
	 
	 
	 
	 Stabilizer(String brand)
	 {
		 System.out.println("invoked stabilizer no -arg const");
		 System.out.println(this);
		 System.out.println(this.brand);
		 this.brand=brand;
		 System.out.println("End of const");
	 }
	 Stabilizer(int voltage)
	 {
		 System.out.println("invoked stabilizer no -arg const");
		 System.out.println(this);
		 System.out.println(this.voltage);
		 this.voltage=voltage;
		 System.out.println("End of const");
		 
		 
		 
	 }
	 Stabilizer(float price)
	 {
		 System.out.println("invoked stabilizer no -arg const");
		 System.out.println(this);
		 System.out.println(this.price);
		 this.price=price;
		 System.out.println("End of const");
	 }
	 Stabilizer(byte number)
	 {
		 System.out.println("invoked stabilizer no -arg const");
		 System.out.println(this);
		 System.out.println(this.number);
		 this.number=number;
		 System.out.println("End of const");
	 }
	
	
}