import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;


public class View {
    private JButton btnCadastrar;
    private JTable grid;
    private JPanel panel;
    private Db db = new Db();
    public View(){
        db.conectar();
    }
    public JPanel getPanel() {
        return panel;
    }
}
