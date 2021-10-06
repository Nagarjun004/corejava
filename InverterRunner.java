class InverterRunner{
	
	public static void main(String [] values){
		
		Inverter inverter=new Inverter();
		System.out.println(inverter.make);
		System.out.println(inverter.color);
		System.out.println(inverter.weight);
		System.out.println(inverter.price);
		System.out.println(inverter.capacity);
		
		inverter.make="Amaron";
		inverter.color="Yellow";
		inverter.price=8000.f;
		
		
		System.out.println(inverter.make);
		System.out.println(inverter.color);
		System.out.println(inverter.weight);
		System.out.println(inverter.price);
		System.out.println(inverter.capacity);
		
	}
	
	
}