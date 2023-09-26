import com.sun.deploy.uitoolkit.ToolkitStore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAll {
    private JButton btnCadastrar;
    private JTable grid;
    private JPanel panel;
    public ViewAll(){
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame cadastrar = new JFrame("Cadastrar");
                cadastrar.setContentPane(new ViewCadastrar().getPanel());
                cadastrar.setSize(500,500);
                cadastrar.setVisible(true);
            }
        });
    }
    public JPanel getPanel() {
        return panel;
    }
}
