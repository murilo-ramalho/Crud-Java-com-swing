import java.sql.Connection;
import java.sql.ResultSet;

public interface Metodo {
    public abstract int cadastrar();
    public abstract int consultar(String nome);
    public abstract int consultarTodos();
    public abstract int alterar();
    public abstract int excluir();
}
