import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewExcluir {
    private JButton btnConfirmar;
    private JLabel lblRecado;
    private JButton btnVoltar;
    private JPanel panel;

    public ViewExcluir() {
        btnConfirmar.addActionListener(new ActionListener() {
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
