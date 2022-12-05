import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Admin extends User{


	@Override
	public boolean login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		if(mp.get(email)!=null&&mp.get(email).equals(password)) {
			System.out.println("Welcome Admin");
			return true;
		}
		System.out.println("Access Denied");
			return false;
		
	}
	 Scanner INPUT = new Scanner(System.in);
	void AC_REJ(Map<Long,Integer>refund,Map<Long,Integer>wallet) {
	       for (Entry<Long, Integer> entry : refund.entrySet()) {
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	       		System.out.println("Enter 1 to accept");
	       		System.out.println("Enter 2 to reject");
	       		
	       		int decide=INPUT.nextInt();
	       		if(decide==1) {
	       			int pp=wallet.get(entry.getKey());
	       			wallet.put(entry.getKey(),entry.getValue()+pp);
	       		}
	       		refund.remove(entry.getKey());
	     			
	}
	
}

}