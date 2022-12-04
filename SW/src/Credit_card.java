import java.util.Map;

public class Credit_card implements Payment_behaviour{
int ID;
String credit_num;
Credit_card(String num,int id){
	credit_num=num;
	ID=id;
}
int get_id() {
	return ID;
}
String getcredit_num() {
	return credit_num;
}
public boolean valid_credit_card(Map<Integer,Integer>user_card,int price) {
	String rkm=getcredit_num();
if(rkm.length()==16&&price<=user_card.get(ID)) {
	return true;
	
}
return false;	
}
public void pay(Map<Integer,Integer>user_card,int price) {
	if(valid_credit_card(user_card,price)) {
		
		user_card.put(ID,user_card.get(ID)-price);
	}
}

}