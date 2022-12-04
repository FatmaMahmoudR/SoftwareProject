
public class Donation extends Service {
	private String name;
	
	Donation(){
		name="Donation";
	}
	void show_options()
	{
		System.out.println("Enter 1 for NGOs");
		System.out.println("Enter 2 for Schools");
		System.out.println("Enter 3 for Cancer_Hospital");
		
	}
	 Service_provider create(int type) {
		 Service_provider p=null;
		 
		 if(type==1) {
			 p=new NGOs();
		 }
		 else if(type==2) {
			 p=new Schools();
		 }
		 else if (type==3) {
			 p=new Cancer_Hospital();
		 }
		
		return p;
	 }
}
