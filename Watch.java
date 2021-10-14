class Watch{
	
	String countryMade;
	
	WatchType type=WatchType.DIGITALWATCH;
	
	Watch(String countryMade)
	{
		System.out.println("invoked const location string");
		this.countryMade=countryMade;
	}
	void displaydetails()
	{
		System.out.println("Invoked displaydetails");
		System.out.println("Watch countryMade:"+this.countryMade);
	}
}