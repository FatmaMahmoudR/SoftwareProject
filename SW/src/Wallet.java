import java.util.Map;

public class Wallet implements Payment_behaviour{
	Long ID;
	
	
	Long get_id() {
		return ID;
	}
	
	Wallet(Long id){
		ID= id;
	}
	
	public void pay(Map<Long,Integer>mp,int price) {
		int p=mp.get(ID);
		if(price<=p) {
			mp.put((long) ID,p-price);
		}
		else {
			System.out.print("Not enough money in your wallet");
		}
	}


	
		
		
	
	
}
