
public class Mobile_recharge extends Service{
	Mobile_recharge(){
		name="Mobile_recharge";
	}
	void show_options()
	{
		System.out.println("Enter 1 for WE");
		System.out.println("Enter 2 for Etisalat");
		System.out.println("Enter 3 for Orange");
		System.out.println("Enter 4 for Vodafone");
	}
	 Service_provider create(int type) {
		 Service_provider p=null;
		 
		 if(type==1) {
			 p=new We();
		 }
		 else if(type==2) {
			 p=new Etisalat();
		 }
		 else if(type==3) {
			 p=new Orange();
		 }
		 else if(type==4) {
			 p=new Vodafone();
		 }
		 
		return p;
	 }

	
}
