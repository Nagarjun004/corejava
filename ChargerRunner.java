class ChargerRunner{
	
	public static void main(String[] values){
		
		Charger charger=new Charger();
		System.out.println(charger.brand);
		System.out.println(charger.color);
		System.out.println(charger.capacity);
		System.out.println(charger.weight);
		System.out.println(charger.price);
		
		
		charger.capacity=66.f;
		charger.color="black";
		charger.weight=50.f;
		
		
		System.out.println(charger.brand);
		System.out.println(charger.color);
		System.out.println(charger.capacity);
		System.out.println(charger.weight);
		System.out.println(charger.price);
		
	}
	
	
}