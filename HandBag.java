class HandBag{
	
	String colour;
	float price=300.0f;
	String brand;
	float sizeOfBag;
	String material="leather";
	float capacity;
	
	HandBag(String color,String company )
	{
		System.out.println("invoked HandBag const string and string");
		System.out.println("color:"+color);
		System.out.println("company:"+company);
		colour=color;
		brand=company;
	}
	
	HandBag(String color)
	{
		System.out.println("invoked handbag const string");
		colour=color;
	}
	HandBag(short size)
	{
		System.out.println("invoked handbag const float");
		sizeOfBag=size;
	}
	HandBag()
	{
		System.out.println("invoked handbag with no arg");
	}
	HandBag(float cap,String mat)
	{
		System.out.println("capacity:"+cap);
		System.out.println("material:"+mat);
		capacity=cap;
		material=mat;
	}	
	HandBag(byte cost)
	{
		System.out.println("invoked handbag string");
		price=cost;
	}
	HandBag(int cost)
	{
		System.out.println("cost:"+cost);
		price=cost;
	}
	HandBag(float name)
	{
		System.out.println("invoked handbag const float");
		capacity=name;
	}	
	HandBag(float cap,float cost)
	{
		System.out.println(cap);
		System.out.println(cost);
		capacity=cap;
		price=cost;
	}
}