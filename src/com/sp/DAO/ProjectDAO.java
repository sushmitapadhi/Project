package com.sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.sp.Project;


public class ProjectDAO {
	Connection connection;
	
	public boolean insertProject(Project p)
	{

		try
		{
		 connection =DBConnector.getConnection();
	    PreparedStatement pst = connection.prepareStatement("insert into users values(?,?,?)");
		
		pst.setInt(1, p.getId());
		pst.setString(2,p.getTitle());
		pst.setString(3,p.getDescription());
		pst.setString(4,p.getDomain());
		pst.execute();
		
		return true;
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		return false;
		
	}

	
		
		

	
	
	
}
