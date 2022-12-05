import java.util.*;
import java.util.Map.Entry;



public class Main {

	public static void main(String[] args) {
		User u=new Client();
		
		Scanner O2 = new Scanner(System.in); 
		System.out.println("Enter Email and password");
		String email=O2.nextLine();
		String password=O2.nextLine();
		Map<String,String>m=new HashMap<String, String>();//database
		//((Client) u).sign_up(email,password,m);
		((Client) u).login(email,password,m);
		

		
		
		
		

	}

}
