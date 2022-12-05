import java.util.*;
import java.util.Map.Entry;
import java.util.ArrayList; // import the ArrayList class‏



public class Main {

	public static void main(String[] args) {
		Scanner O3 = new Scanner(System.in); 
		ArrayList<String> services = new ArrayList<String>(); // Create an ArrayList object‏
		services.add("Mobile_recharge");
		services.add("Internet_Payment");
		services.add("Landline");
		services.add("Donations");
		User u;
		Map<String,String>Admin=new HashMap<String, String>();//database
		Map<String,String>m=new HashMap<String, String>();//database
		Admin.put("Admin1", "Admin");
		System.out.println("If you are admin enter 1");
		System.out.println("If you are user enter 2");
		int choice;
		choice=O3.nextInt();
		if(choice==1) {
			 u=new Admin();
		System.out.println("Enter Email and password");
		String email=O3.nextLine();
		String password=O3.nextLine();
		
		((Admin) u).login(email,password,Admin);
		}		
		else {
			Scanner O4 = new Scanner(System.in); 
			Scanner O5 = new Scanner(System.in); 

			u=new Client();
				System.out.println("Enter Email and password");
				String email=O4.nextLine();
				String password=O4.nextLine();
				((Client) u).sign_up(email,password,m);
							
				System.out.println("Enter Email and password");
				//User uu=new Client();

				String email2=O5.nextLine();
				String password2=O5.nextLine();
				if(((Client) u).login(email2,password2,m)==true) {
					u.show_service_options(services);
				}
				

				//System.out.println("if you will not select any thing from services Press number 7");

				int select;
				select=O3.nextInt();
				Service_factory obj=new Service_factory() ;
				Service ans=obj.create_Service(select);
				
			System.out.println("You are now on the system "+ans.get_name());
				}
				
				
				

				
			
	
		}
		
	
	}



