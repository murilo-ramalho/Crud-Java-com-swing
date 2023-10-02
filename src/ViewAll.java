import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

public class ViewAll {
    private JButton btnCadastrar;
    private JTable grid;
    private JPanel panel;
    private JButton btnBuscar;
    private Contato contato = new Contato();

    public ViewAll() {
        mostrar();

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame cadastrar = new JFrame("Cadastrar");
                cadastrar.setContentPane(new ViewCadastrar().getPanel());
                cadastrar.setSize(500,500);
                cadastrar.setVisible(true);
            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame buscar = new JFrame("Buscar");
                buscar.setContentPane(new ViewOne().getPanel());
                buscar.setSize(500,500);
                buscar.setVisible(true);
            }
        });
    }

    private void mostrar() {
        try {
        String[] cabecalho = {"id", "nome", "telefone", "email", "sexo"};
        Object[][] dados = getContato().list;

        grid.setEnabled(false);
        grid.setModel(new DefaultTableModel(dados, cabecalho));
        grid.setEnabled(true);
    } catch (Exception e){
        System.out.println("erro na hora de mostrar: "+e);
    }
        System.out.println(contato.getRes());
    }
    public JPanel getPanel() {
        return panel;
    }

    public Contato getContato() {
        return contato;
    }
}
