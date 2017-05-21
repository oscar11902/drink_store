package fcu.oscar_chen.db;
import java.sql.*;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;;


public class manager {
	 public Connection getConnection() throws SQLException
	    {
	        SQLiteConfig config = new SQLiteConfig();
	        // config.setReadOnly(true);   
	        config.setSharedCache(true);
	        config.enableRecursiveTriggers(true);
	    
	            
	        SQLiteDataSource ds = new SQLiteDataSource(config); 
	        ds.setUrl("jdbc:sqlite:data/sample.db");
	        return ds.getConnection();
	        //ds.setServerName("sample.db");
	 
	        
	    }

}
