class RefrigeratorStarter{
	
	public static void main(String [] args)
	{
		Refrigerator refrigerator=new Refrigerator("LG",20.0);
		String company=refrigerator.getCompany();
		double price=refrigerator.getPrice();
		if(company!=null)
		{
			System.out.println(company);
		}
		if(price>0)
		{
			System.out.println(price);
		}
		refrigerator.setCompany("samsung");
		refrigerator.setPrice(53.0);
		System.out.println(refrigerator.getCompany());
		System.out.println(refrigerator.getPrice());
		
	}

}