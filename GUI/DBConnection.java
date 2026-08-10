import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    
    private static final String JDBC_URL =  "jdbc:mysql://localhost:3306/employeedb";
    private static final String USER_NAME =  "root";
    private static final String PASSWORD = "";
    private static Connection getConnect(){
        
        Connection conn=null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, USER_NAME,PASSWORD);
            System.out.println("Connected to the database");

            String sql = "SELECT * FROM employee";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id")+" Name: "+ rs.getString("name") + " Department: "+ rs.getString("department"));
            }

            rs.close();
            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        
        return conn;
    }


    public static void main(String[] args) {
        getConnect();
    }

}

