class PowerBankRunner{
	
	public static void main(String[] values)
	{
		PowerBank power=new PowerBank();
		String company=power.company;
		int storage=power.capacity;
		short amount=power.price;
		
		System.out.println(company);
		System.out.println(storage);
		System.out.println(amount);
		
	}
	
	
}