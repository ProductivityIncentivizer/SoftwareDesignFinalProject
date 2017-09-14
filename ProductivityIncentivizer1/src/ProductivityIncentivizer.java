import java.util.Scanner;

public class ProductivityIncentivizer {

	public ProductivityIncentivizer() {
		
		
	}
	//Prompts user to create account, calls the AccountFactory
	public void promptUserToCreateAccount(){
		Scanner in = new Scanner(System.in);
		user_input = in.nextLine();
		AccountFactory accountFactory = new AccountFactory();
		System.out.println("Please select student worker (1) or supervisor (2).");
		if (user_input.equals("1")){
			accountFactory.getAccount(/*parameter*/);
			else if (user_input.equals("2")){
				accountFactory.getAccount(/*differentparameter*/);
			}		
		}
	}

	public static void main(String[] args) {

	}

}
