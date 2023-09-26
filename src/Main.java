import javax.swing.*;

/*
*   Trabalho feito em java e swing para fazer um crud
*   Grupo: Murilo Ramalho
*
*   RNFs: O sistema deverá ser escrito em Java.
*   O sistema deverá ter uma interface em Java, usando a biblioteca swing.
*   O sistema deverá consumir um banco de dados MySQLque será anexado a este trabalho.
*   O sistema deve ser versionado em github
*
*   RFs: O sistema irá lidar com controle de cadastros, os cadastros possuem nome, email, telefone e sexo.
*   O sistema deverá exibir uma listagem de contatos.
*   O sistema deverá ser capaz de cadastrar um contato específico.
*   O sistema deverá ser capaz de alterar um contato específico.
*   O sistema deverá ser capaz de excluir um contato específico.
*   O sistema deverá ser capaz de exibir um contato específico.
*   O sistema deverá armazenar o nome, telefone, email e sexo dos contatos.
*   Se o contato for do sexo “M”, o fundo da tela de exibir e alterar contato deverá ser Verde.
*   Se o contato for do sexo “F”, o fundo da tela de exibir e alterar contato deverá ser Amarela.
*   Se o contato não tiver telefone cadastrado, deverá ser exibido nas telas de exibir e alterar contato a mensagem “O telefone não foi informado”.
*   Se o contato não tiver email cadastrado, deverá ser exibido nas telas de exibir e alterar contato a mensagem “O email não foi informado”.
*   O único campo de preenchimento obrigatório é o nome.
*
* */
public class Main {
    public static void main(String[] args) {
        JFrame view = new JFrame("Listar Contatos");
        view.setContentPane(new ViewAll().getPanel());
        view.setSize(500,500);
        view.setVisible(true);
    }
}