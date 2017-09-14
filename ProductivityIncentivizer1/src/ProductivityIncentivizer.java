import java.util.Scanner;

public class ProductivityIncentivizer {

	public ProductivityIncentivizer() {

	}
	
	/**
	 * Prompts user to create account, calls the AccountFactory
	 */
	public void promptUserToCreateAccount(){
		String employeeName;
		String employeeType;
		String supervisorCode = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name.");
		employeeName = in.nextLine();
		
		System.out.println("Please select student worker (1) or supervisor (2).");
		employeeType = in.nextLine();
		
		if(employeeType.equals("2")) {
			boolean supervisorCodeCheck = false;
			while(supervisorCodeCheck == false) {
				System.out.println("Please enter supervisor code: ");
				supervisorCode = in.nextLine();	
			}
		}
		
		in.close();
		addAccount(employeeName, employeeType, supervisorCode);
	}
	
	/**
	 * Adds account, called by promptUserToCreateAccount
	 * @param employeeName
	 * @param employeeType
	 * @return boolean used for testing
	 */
	public boolean addAccount(String employeeName, String employeeType, String supervisorCode) {
		AccountFactory accountFactory = new AccountFactory();
		if (employeeType.equals("1")) {
			accountFactory.getAccount(employeeType, employeeName);		
			return true;
		}
		else if (employeeType.equals("2")){
			if (supervisorCode.equals("123")) {
				accountFactory.getAccount(employeeType, employeeName);
				return true;
			}
			else { //invalid code input
					return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ProductivityIncentivizer runProgram = new ProductivityIncentivizer();
		runProgram.promptUserToCreateAccount();
	}

}
