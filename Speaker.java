class Speaker{
	public static void volume(int level){
		
		if(level<=0)
		{
			System.out.println("invoked level zero");
			String line="on it first";
			return line;
			
		}
		else if(level<=3)
		{
			System.out.println("invoked lesser than or equal to three");
			String line1="ok";
			return line1;
			
		}
		else if(level>3&&level<5)
		{
			System.out.println("invoked level between three five");
			String line2="loud";
			return line2;
		
		}
		else if(level>=5&&level<9)
		{
			System.out.println("invoked level between five and eight");
			String line3="too loud";
			return line3;
			
		}
		else if(level>9)
		{
			System.out.println("invoked level greater than nine");
			String line4="call police";
			return line4;
			
		}
	}
	public static boolean turnOn()
	{
		System.out.println("invoked turnOn");
		boolean on=true;
		return on;
	}
	public static boolean turnOff()
	{
		System.out.println("invoked turnOff");
		boolean off=false ;
		return off;
	}

		
		
		
		
	}
	
	
	
	
	
	
		
		
		
		
		
		