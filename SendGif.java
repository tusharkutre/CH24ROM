class SendGif{
	
	public static void sendGift(String name,int price,long date){
		System.out.println("gift sent");
		AssignClass.assign(name,price,date);
		System.out.println("gift received");
	}
	
}