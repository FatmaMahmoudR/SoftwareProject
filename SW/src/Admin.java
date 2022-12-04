import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Admin extends User{


	@Override
	public void login(String email, String password, Map<String, String> mp) {
		// TODO Auto-generated method stub
		if(mp.get(email)==password) {
			System.out.println("Welcome Admin");
		}else System.out.println("Access Denied");
		
	}
	 Scanner INPUT = new Scanner(System.in);
	void AC_REJ(Map<Integer,Integer>refund,Map<Integer,Integer>wallet) {
	       for (Entry<Integer, Integer> entry : refund.entrySet()) {
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