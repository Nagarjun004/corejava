class FoodItem{
	
	public static String foodItems(String[] items){
		
		System.out.println("invoked foodItems");
		int size=items.length;
		if(size>0 && size<=6)
		{
			return "chicken";
		}
		else if(size>6)
		{
			return "seafood";
		}
		return "NA";
		
	}
	
}