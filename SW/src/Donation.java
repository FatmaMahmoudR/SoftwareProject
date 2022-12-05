import java.util.Scanner;

public class Donation extends Service {
	private String name;
	
	Long id;
	public void setid(Long idd){
		id=idd;
	}

	public Long getid() {
		return id;
	}
	String get_name() {
		return "Donation";
	}
	Donation(){
		name="Donation";
	}
	void show_options()
	{
		System.out.println("Enter 1 for NGOs");
		System.out.println("Enter 2 for Schools");
		System.out.println("Enter 3 for Cancer_Hospital");
		
	}
	
	public Payment_behaviour rechageProccess(Service_provider p) {
		Service s =new Donation();
		 Scanner I5 = new Scanner(System.in);
		 
		 System.out.println("Enter Value to donate");
		 int value=I5.nextInt();
		 ((NGOs) p).setv(value);
		 
		 int r = p.receipt(s);
		 System.out.println("Your Bill is "+r);
		 
		System.out.println("Enter 1 for Wallet");
		System.out.println("Enter 2 for CreditCard");
		Scanner I6 = new Scanner(System.in);
		int n=I6.nextInt();	
		if(n==1) {
			 pay_behave = new Wallet(id);
			 
		}else if(n==2) {
			System.out.println("Enter Your CreditCard Number");
			Scanner I7 = new Scanner(System.in);
			Long card_num=I7.nextLong();
			pay_behave = new Credit_card(card_num,card_num);
		}
		return pay_behave;
		
	}
	 Service_provider create(int type)
	 {
		 Service_provider p=null;
		 
		 if(type==1) {
			 p=new NGOs();
			 rechageProccess(p);
		 }
		 else if(type==2) {
			 p=new Schools();
			 rechageProccess(p);
		 }
		 else if (type==3) {
			 p=new Cancer_Hospital();
			 rechageProccess(p);
		 }
		
		return p;
	 }
}
