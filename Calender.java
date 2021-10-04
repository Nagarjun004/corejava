class Calender{
	public static int getBirthMonth(String personName){
		
		if(personName=="Nagarjun")
		{
			System.out.println("invoked birth month");
			int month=8;
			return month;
		}
		else if(personName=="Basavaraj")
		{
			System.out.println("invoked birth month");
			int month1=9;
			return month1;
		}
		else
		{
			System.out.println("birth month not found");
			return 0;
		}
		
	}

	
         public static String getBirthDay(String personName)
	{
		if (personName=="Nagarjun")
		{
			System.out.println("invoked birth day");
			String day="Thursday";
			return day;
		}
		else if(personName=="Basavaraj")
		{
			System.out.println("invoked birth day");
			String day1="Monday";
			return day1;
		}
		else
		{
			System.out.println("name not found");
			String day2="not found";
			return day2;
		}
		
}
	
	
}
	
