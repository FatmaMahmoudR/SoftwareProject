import java.util.ArrayList;
import java.util.Map;

public abstract class User {
	private String email, password;
	
	
	abstract public void login(String email, String password,Map<String,String>mp);
	
	 public void show_service_options(ArrayList<String>options) {
		 for(int i=0;i<options.size();i++) {
			 System.out.println(options.get(i));
		 }
	 }
	
}
