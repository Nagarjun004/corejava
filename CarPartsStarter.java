class CarPartsStarter{
	
	public static void main(String [] tuesday)
	{
		
		CarParts carparts=new CarParts("crata",1500000.0f);
		String cmpny=carparts.company;
		System.out.println(cmpny);
		float price=carparts.price;
		System.out.println(price);
		CarSpareParts parts=carparts.parts;
		String nm=carparts.name;
		System.out.println(nm);
		int driven=carparts.kmDriven;
		System.out.println(driven);
		
		
		
		carparts.parts=CarSpareParts.VIPER;
		parts=carparts.parts;
		System.out.println(carparts);
		
		carparts.kmDriven=23004;
		System.out.println(carparts.kmDriven);
		
		CarParts car=new CarParts();
		System.out.println(car.company);
		System.out.println(car.price);
		
	}
}