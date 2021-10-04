class Ornament{
	public static String ornamentItems(String[] items){
		System.out.println("invoked ornamentItems");
		int size=items.length;
		if(size>=0 && size<3)
		{
			return "chain";
		}
		else if(size>=4)
		{
			return "Ring";
		}
		return "NA";
		
		
	}
	
	
	
}