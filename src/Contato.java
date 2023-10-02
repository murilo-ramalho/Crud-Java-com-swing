import javax.swing.*;
import java.sql.*;

public class Contato implements Metodo{
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private char sexo;

    public String[][] list = new String[50][5];
    private Connection conn;
    private PreparedStatement pstm;
    private int res;

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"erro na hora de cadastrar: "+e);
            setRes(400);
        }

        return res;
    }

    @Override
    public int consultar(String nome) {
        String qwery = "SELECT * FROM contatos WHERE nome = ?";
        conn = new Db().conectar();
        try {
            pstm = conn.prepareStatement(qwery+nome);
            pstm.setString(1,getNome());
            ResultSet retorno = pstm.executeQuery();

            list[1][0] = String.valueOf(retorno.getInt("id"));
            list[1][1] = retorno.getString("nome");
            list[1][2] = retorno.getString("telefone");
            list[1][3] = retorno.getString("email");
            list[1][4] = retorno.getString("sexo");

            setRes(200);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erro no consultar; "+e);
        }

        return res;
    }

    @Override
    public int consultarTodos() {
        String selectQuery = "SELECT * FROM contatos";

        try {
            pstm = conn.prepareStatement(selectQuery);
            ResultSet retorno = pstm.executeQuery();
            int  i = 0;
            System.out.println("aqui");
            while (retorno.next()){
                list[i][0] = String.valueOf(retorno.getInt("id"));
                list[i][1] = retorno.getString("nome");
                list[i][2] = retorno.getString("telefone");
                list[i][3] = retorno.getString("email");
                list[i][4] = retorno.getString("sexo");

                i++;
            }
            setRes(200);
        } catch (SQLException e){
            System.out.println("ERRO na hora de puxar os contatos:" + e.getMessage());
            setRes(400);
        }

        return res;
    }

    @Override
    public int alterar() {
        String qwery = "UPDATE contatos SET nome = ?, telefone = ?, email = ?, sexo = ?";
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
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erro no alterar: "+e);
            setRes(400);
        }

        return res;
    }

    @Override
    public int excluir() {
        String qwery = "DELETE FROM contatos WHERE nome = ?";
        conn = new Db().conectar();

        try {
            pstm = conn.prepareStatement(qwery);
            pstm.setString(1,getNome());
            pstm.execute();
            pstm.close();
            setRes(200);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"erro na hora de escluir: "+e);
            setRes(400);
        }

        return res;
    }
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
}
