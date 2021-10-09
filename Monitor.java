class Monitor{
	
	float length;
	String brand="dell";
	int price=69000;
	int brightNess=400;
	byte refreshRate=90;
	
	Monitor(float length)
	{
		System.out.println("invoked monitor with no arg const");
		System.out.println(this);
		System.out.println(this.length);
		this.length=length;
		System.out.println("end of const");
	}
	Monitor(int brightNess)
	{
		System.out.println("invoked monitor with no arg const");
		System.out.println(this);
		System.out.println(this.brightNess);
		this.brightNess=brightNess;
		System.out.println("end of const");
	}
	Monitor(String brand)
	{
		System.out.println("invoked monitor with no arg const");
		System.out.println(this);
		System.out.println(this.brand);
		this.brand=brand;
		System.out.println("end of const");
		
	}
	Monitor(byte refreshRate)
	{
		System.out.println("inrefreshRatevoked monitor with no arg const");
		System.out.println(this);
		System.out.println(this.refreshRate);
		this.refreshRate=refreshRate;
		System.out.println("end of const");
	}
	
	
}