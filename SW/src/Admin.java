import java.util.ArrayList;
import java.util.Map;

public class Admin extends User{


	@Override
	public void login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		if(mp.get(email)==password) {
			System.out.println("Welcome Admin");
		}else System.out.println("Access Denied");
		
	}
	
}
