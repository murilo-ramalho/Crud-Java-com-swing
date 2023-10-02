import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewOne {
    private JTable table1;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JPanel panel;
    private JLabel lblBuscar;
    private JTextField txtNome;
    private JButton btnMenu;
    private JButton btnBuscar;
    private Contato contato = new Contato();

    public ViewOne() {
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame view = new JFrame("Alterar");
                view.setContentPane(new ViewAlterar().getPanel());
                view.setSize(500,500);
                view.setVisible(true);
            }
        });
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame view = new JFrame("Excluir");
                view.setContentPane(new ViewExcluir().getPanel());
                view.setSize(500,500);
                view.setVisible(true);
            }
        });
        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame view = new JFrame("Listar Contatos");
                view.setContentPane(new ViewAll().getPanel());
                view.setSize(500,500);
                view.setVisible(true);
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    contato.consultar(txtNome.getText());
                    String[] model = {"id","nome","telefone","email","sexo"};
                    Object[][] dados = contato.list;

                    table1.setEnabled(false);
                    table1.setModel(new DefaultTableModel(dados, model));
                    table1.setEnabled(true);
                } catch (Exception ee){
                    JOptionPane.showMessageDialog(null,"erro na hora de buscar:"+ee);
                }
            }
        });
    }

    public JPanel getPanel(){
        return panel;
    }
}
