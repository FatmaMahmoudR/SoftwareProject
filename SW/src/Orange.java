import java.util.ArrayList;

public class Orange extends Service_provider {
	
	String phone;
	public double value;
	public int taxes;
	
	public void setp(String p) {
		phone =p;
	
	}
	public void setv(int v) {
		value=v;
	}
	

	@Override
	public int receipt(Service s) {
		if(s.get_name()=="Mobile_recharge") {
		
			taxes= (int) (value*1.3) ;
		}
		else if(s.get_name()=="Internet_Payment") {

			taxes=150;
		}
		return taxes ;
		
	
		
	}

}
