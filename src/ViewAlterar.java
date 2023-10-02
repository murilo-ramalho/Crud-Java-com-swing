import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAlterar {
    private JTextField texNome;
    private JTextField textTelefone;
    private JTextField textSexo;
    private JButton btnAlterar;
    private JButton btnVoltar;
    private JPanel panel;
    private JLabel lblNome;
    private JLabel lblTelefone;
    private JLabel lblSexo;
    public ViewAlterar() {
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame buscar = new JFrame("Buscar");
                buscar.setContentPane(new ViewOne().getPanel());
                buscar.setSize(500,500);
                buscar.setVisible(true);
            }
        });
    }
    public JPanel getPanel(){
        return panel;
    }
}
