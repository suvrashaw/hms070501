package sqlcon;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
public class sqlcon {
    private static final String servername = "localhost";
    private static final String username = "root";
    private static final String dbname = "hms070521";
    private static final int portnumber = 3306;
    private static final String password = "suvra";
    public static Connection getCon(){
        try{
        Class.forName("com.mysql.JDBC.Driver");
        //Connection con=DriverManager.getConnection("jdbc:mysel://localhost:3306/project","root","suvra");
        Connection con=null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        return con;
        }
        catch(ClassNotFoundException e)
        {
            return null;
        }
    }
}