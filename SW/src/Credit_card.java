import java.util.Map;

public class Credit_card implements Payment_behaviour{
Long ID;
Long credit_num;
Credit_card(Long num,Long id){
	credit_num=num;
	ID=id;
}
Long get_id() {
	return ID;
}
Long getcredit_num() {
	return credit_num;
}
public boolean valid_credit_card(Map<Long,Integer>user_card,int price) {
	Long rkm=getcredit_num();
if(rkm >1e15 && rkm<1e16 &&price<=user_card.get(ID)) {
	return true;
	
}
return false;	
}
public void pay(Map<Long,Integer>user_card,int price) {
	if(valid_credit_card(user_card,price)) {
		
		user_card.put(ID,user_card.get(ID)-price);
	}
}

}