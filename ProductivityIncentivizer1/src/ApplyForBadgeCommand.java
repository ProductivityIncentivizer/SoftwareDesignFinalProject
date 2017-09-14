import java.util.ArrayList;

/**
 * this class defines the process for applying for a badge
 * A student worker sends in a list of all the badges he/she is applying for 
 * */
public class ApplyForBadgeCommand implements BadgeCommand {

	private ArrayList<Badge> badgeList;
	private String studentWorkerName;
	 private String status = "";
	 private int iD;
	// private ArrayList<Badge> ;
	
	public ApplyForBadgeCommand(String studentWorkerName,int iD, ArrayList<Badge> badgeList) {
		this.badgeList = badgeList;
		this.studentWorkerName = studentWorkerName;
		this.iD = iD;
		
	}

	
	@Override
	public void executeCommand() {
		
		for(Badge badges: badgeList) {
			
			if(badges!= null) {
			   updateBadgeStatus(badges);
				
			   
				//In process == status
				//method that deals with database
				
			   //change applicant user ID at the same time
				
				
			}
			
		}
		
	}

	@Override
	public void undoCommnd() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * method meant to simulate what changing a badge status would look like
	 * @param badge is the badge received
	 * */
   public void updateBadgeStatus(Badge badge) {
	   this.status = "In progress";
	   
	   
	   
	   
   }
	public String toString() {
		
		
		return "";
	}

}
