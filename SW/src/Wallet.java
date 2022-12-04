import java.util.Map;

public class Wallet implements Payment_behaviour{
	int ID;
	
	int get_id() {
		return ID;
	}
	
	
	public void pay(Map<Integer,Integer>mp,int price) {
		int p=mp.get(ID);
		if(price<=p) {
			mp.put(ID,p-price);
		}
		else {
			System.out.print("Not enough money in your wallet");
		}
	}
		
		
	
	
}
