
public class Landline extends Service{
	Landline(){
		name="Landline";
	}
	void show_options()
	{
		System.out.println("Enter 1 for Quarter");
		System.out.println("Enter 2 for Monthly");
	
	}
	
	 Service_provider create(int type) {
		 Service_provider p=null;
		 
		 if(type==1) {
			 p=new Quarter();
		 }
		 else if(type==2) {
			 p=new Monthly();
		 }
		
		return p;
	 }


	
}
