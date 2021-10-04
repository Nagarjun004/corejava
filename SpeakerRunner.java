class SpeakerRunner{
	
	public static void main(String [] args){
		
		int level=9;
		Speaker.volume(level);
		String spkr=Speaker.volume(level);
		System.out.println(spkr);
		Speaker.turnOn();
		boolean type=Speaker.turnOn();
		System.out.println(type);
		Speaker.turnOff();
		boolean check=Speaker.turnOff();
		System.out.println(check);
	}
		
		
		
	}