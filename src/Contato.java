import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Contato implements Metodo{
    private int id;
    private String nome;
    private double telefone;
    private String email;
    private char sexo;

    Connection conn;
    PreparedStatement pstm;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void cadastrar() {
        String qwery = "INSERT INTO contatos(nome,telefone,email,sexo) VALUES(?,?,?,?)";
        conn = new Db().conectar();

        try {
            pstm = conn.prepareStatement(qwery);
            pstm.setString(1,getNome());
            pstm.setDouble(2,getTelefone());
            pstm.setString(3,getEmail());
            pstm.setString(4,String.valueOf(getSexo()));

            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"fudeo "+e);
        }
    }

    @Override
    public void consultar() {

    }

    @Override
    public void consultarTodos() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void excluir() {

    }
}
