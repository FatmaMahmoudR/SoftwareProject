
public abstract class Service {
public Payment_behaviour pay_behave;
public String name;
 


String abstract get_name() {
	return name;
}
abstract Service_provider create(int type);

public Service set_service(int type) {
	if(type==0) {
		s= new Mobile_recharge();
	}
if(type==1) {
		s= new Internet_Payment();
		
	}if(type==2) {
		s= new Landline ();

		
	}if(type==3) {
		s= new Donation();
		
	}
	return s;
}
}
