import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Contato implements Metodo{
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private char sexo;

    private Connection conn;
    private PreparedStatement pstm;
    private int res;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public int cadastrar() {
        String qwery = "INSERT INTO contatos(nome,telefone,email,sexo) VALUES(?,?,?,?)";
        conn = new Db().conectar();

        try {
            pstm = conn.prepareStatement(qwery);
            pstm.setString(1,getNome());
            pstm.setString(2,getTelefone());
            pstm.setString(3,getEmail());
            pstm.setString(4,String.valueOf(getSexo()));

            pstm.execute();
            pstm.close();
            setRes(200);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"erro na hora de cadastrar:"+e);
            setRes(400);
        }

        return res;
    }

    @Override
    public int consultar() {
        return res;
    }

    @Override
    public int consultarTodos() {
        return res;
    }

    @Override
    public int alterar() {
        return res;
    }

    @Override
    public int excluir() {
        return res;
    }
}
