import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCExample {
    public static void main(String[] args) {

        try {
            
            Class.forName("org.sqlite.JDBC");

            Connection conn =
                DriverManager.getConnection("jdbc:sqlite:students.db");

            
            Statement stmt = conn.createStatement();

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            
            System.out.println("ID\tName\tAge");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("age")
                );
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
