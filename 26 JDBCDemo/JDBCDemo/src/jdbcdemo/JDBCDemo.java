package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class JDBCDemo {

    /**
     * @param args the command line arguments
	 * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/sales";
        
        Connection conn = DriverManager.getConnection(url, "ctuonline", "student");
        
        Statement statement = conn.createStatement();
        
        
        int count = statement.executeUpdate(
                "insert into product values(99, 'Java Lessons', 'Learning Java', 22.95)");
        
        
        System.out.println("count = " + count);
        
        count = statement.executeUpdate("update product set price=199.99 where id = 99");
        
        System.out.println("count = " + count);

        
        ResultSet results = statement.executeQuery("select * from product");
        while (results.next())
        {
            int id = results.getInt("id");
            String name = results.getString("name");
            String description = results.getString("description");
            double retailPrice = results.getDouble("price");
            Product p = new Product();
            p.setId(id);
            p.setName(name);
            p.setDescription(description);
            p.setRetailPrice(retailPrice);
            
            System.out.println(p);
        }

        count = statement.executeUpdate("delete from product where id = 99");
        
        System.out.println("count = " + count);
        
    }
    
}
