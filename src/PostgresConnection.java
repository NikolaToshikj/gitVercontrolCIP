import java.sql.*;
public class PostgresConnection {
    public static void main(String[] args)
    {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "nikola toshikj";
        String password = "AshuraIsGod321@";
        try{
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to Postgres database");
            con.close();
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
