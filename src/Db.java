import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db implements Connect{
    private final String url = "jdbc:mysql://localhost/contatos";
    private final String user = "root";
    private final String pass = "";
    private int mensagem;
    @Override
    public int conectar() {
        Connection conn = connect();
        if (mensagem == 200) System.out.println("conexão com o banco de dados estabilecida");
        return mensagem;
    }
    private Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,pass);
            mensagem = 200;
        }catch (SQLException e){
            mensagem = 400;
            System.out.println("erro:"+e.getMessage());
        }

        return conn;
    }
    public int getMensagem(){
        return mensagem;
    }
}
