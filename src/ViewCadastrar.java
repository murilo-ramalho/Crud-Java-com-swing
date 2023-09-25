import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCadastrar {
    private JPanel panel;
    private JTextField txtNome;
    private JTextField txtEmail;
    private JLabel lblNome;
    private JLabel lblEmail;
    private JButton btnCadastrar;
    private JLabel lblsexo;
    private JTextField txtSexo;
    private JLabel lblTelefone;
    private JTextField txtTelefone;

    public ViewCadastrar() {
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, email, sexo1, telefone;
                char sexo;

                nome = txtNome.getText();
                telefone = txtTelefone.getText();
                email = txtEmail.getText();
                sexo1 = txtSexo.getText();

                double telefone1 = Double.parseDouble(telefone);
                sexo = sexo1.charAt(0);

                Contato contato = new Contato();
                contato.setNome(nome);
                contato.setTelefone(telefone1);
                contato.setEmail(email);
                contato.setSexo(sexo);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblEmail() {
        return lblEmail;
    }

    public void setLblEmail(JLabel lblEmail) {
        this.lblEmail = lblEmail;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public void setBtnCadastrar(JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    public JLabel getLblsexo() {
        return lblsexo;
    }

    public void setLblsexo(JLabel lblsexo) {
        this.lblsexo = lblsexo;
    }

    public JTextField getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(JTextField txtSexo) {
        this.txtSexo = txtSexo;
    }
}
