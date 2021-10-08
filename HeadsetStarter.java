class HeadsetStarter{
	public static void main(String[] args)
	{
new Headset();
new Headset("boat");
new Headset(3000.0f);
new Headset(500);
new Headset("Lumiford","wireless");
Headset set=new Headset(4500.0f,80);
System.out.println(set.price);
System.out.println(set.noiseCancellation);
new Headset("Single-ear",40);
Headset check=new Headset(90,"onePlus");
System.out.println(check.noiseCancellation);
System.out.println(check.brand);
new Headset(2700.0f,"bluetooth","dual-ear");
Headset out=new Headset("Sony",50000.0f,"ribbon microphone");
System.out.println(out.brand);
System.out.println(out.price);
System.out.println(out.type);
System.out.println(out.noiseCancellation);
System.out.println(out.mic);
	}













}