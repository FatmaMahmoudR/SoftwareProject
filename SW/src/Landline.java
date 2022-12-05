import java.util.Scanner;

public class Landline extends Service{
	
	Long id;
	public void setid(Long idd){
		id=idd;
	}

	public Long getid() {
		return id;
	}
	
	Landline(){
		name="Landline";
	}
	
	
	public Payment_behaviour rechageProccess(Service_provider p) {
		Service s =new Mobile_recharge();
		 Scanner I20 = new Scanner(System.in);
		 System.out.println("Enter your Phone Number ");
		 String phone =I20.nextLine();	
		 ((We) p).setp(phone);
		 
		 int r = p.receipt(s);
		 System.out.println("Your Bill is "+r);
		 
		System.out.println("Enter 1 for Wallet");
		System.out.println("Enter 2 for CreditCard");
		Scanner I21 = new Scanner(System.in);
		int n=I21.nextInt();	
		if(n==1) {
			 pay_behave = new Wallet(id);
			 
		}else if(n==2) {
			System.out.println("Enter Your CreditCard Number");
			Scanner I22 = new Scanner(System.in);
			Long card_num=I22.nextLong();
			pay_behave = new Credit_card(card_num,card_num);
		
		}
		return pay_behave;
		
	}
	
	
	 Service_provider create(int type) {
		 Service_provider p=null;
		 
		 if(type==1) {
			 p=new Quarter();
			 rechageProccess(p);
		 }
		 else if(type==2) {
			 p=new Monthly();
			 rechageProccess(p);

		 }
		
		return p;
	 }


	
}
