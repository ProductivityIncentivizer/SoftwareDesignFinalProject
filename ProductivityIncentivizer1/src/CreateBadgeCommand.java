
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateBadgeCommand implements BadgeCommand{
	public static final String PORT_NUMBER = "8889";

	public CreateBadgeCommand() {
		
	}

	@Override
	public void executeCommand(Badge badge) {
		try(
			Connection conn = DriverManager.getConnection("jbc:mysql://localhost:" + PORT_NUMBER + "/ProductivityIncentivizerDatabase?user=root&password=root");
			Statement stmt = conn.createStatement();
		){
			String insertBadge = "insert into Badge"
					+ "(badgeName, badgeDescription, creatorUserId, badgeStatus)";	
		}catch(SQLException e){
			e.printStackTrace();
		}
			
	}

	@Override
	public void undoCommnd() {

		
	}

}
