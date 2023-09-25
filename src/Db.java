import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db implements Connect{
    private final String url = "jdbc:mysql://localhost/contatos";
    private final String user = "root";
    private final String pass = "";


    private Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,pass);
        }catch (SQLException e){
            System.out.println("erro:"+e.getMessage());
        }

        return conn;
    }

    @Override
    public Connection conectar() {
        Connection conn = connect();
        return conn;
    }
}
