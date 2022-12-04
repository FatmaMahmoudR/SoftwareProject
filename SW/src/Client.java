import java.util.ArrayList;
import java.util.Map;

public class Client extends User{

	static int ID=0;
	
	 Client() {
		ID++;
	}
	 
	@Override
	public void login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		
		if(mp.get(email)==password) {
			System.out.println("Welcome ");
		}else System.out.println("Not Exist");
		
		
	}
	public void sign_up(String email, String password, Map<String, String> mp) {
		mp.put(email,password);
		
	}
	public boolean search_service(ArrayList<Service>ss,String s)
	{	
		for(int i=0;i<ss.size();i++) {
			if(ss.get(i).name==s) {
				return true;
			}
			
		}
		return false;
		

	
}
public void request_refund (Map<Integer,Integer>mp,int refund_val) {
		
		int p=mp.get(ID);
		mp.put(ID,p+refund_val);
	}
}