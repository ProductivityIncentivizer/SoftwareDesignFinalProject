import java.util.Scanner;

public class ProductivityIncentivizer {

	public ProductivityIncentivizer() {
<<<<<<< HEAD
=======
		



		
>>>>>>> branch 'master' of https://github.com/ProductivityIncentivizer/SoftwareDesignFinalProject.git
	}
	
	/**
	 * Prompts user to create account, calls the AccountFactory
	 */
	public void promptUserToCreateAccount(){
		String employeeName;
		String employeeType;
		AccountFactory accountFactory = new AccountFactory();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name.");
		employeeName = in.nextLine();
		
		System.out.println("Please select student worker (1) or supervisor (2).");
		employeeType = in.nextLine();
		
		if (employeeType.equals("1")){
			accountFactory.getAccount(employeeType, employeeName);		
		}
<<<<<<< HEAD
		
		else if (employeeType.equals("2")){
			boolean supervisorCodeCheck = false;
			while(supervisorCodeCheck == false) {
				
				System.out.println("Please enter supervisor code: ");
				String supervisorCode = in.nextLine();
				if (supervisorCode.equals("123")) {
					supervisorCodeCheck = true;
					accountFactory.getAccount(employeeType, employeeName);
				}
				else {
					System.out.println("Supervisor code was incorrect. Please try again.");
				}
			}
		}
		in.close();
=======
t
>>>>>>> branch 'master' of https://github.com/ProductivityIncentivizer/SoftwareDesignFinalProject.git
	}

	public static void main(String[] args) {
		ProductivityIncentivizer runProgram = new ProductivityIncentivizer();
		runProgram.promptUserToCreateAccount();
	}

}
