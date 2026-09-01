/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automedterca;

import tela.DlgLogin;

/**
 *
 * @author fabricio.pretto
 */
public class AutoMedTerca {

//    public static Connection conexao = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // abrir uma tela de Login
        new DlgLogin(null, true).setVisible(true);

        // deixa de existir
//        if (ConexaoBD.getInstance() != null) {
//            System.out.println("abriu");
//            new FrmJanelaPrincipal().setVisible(true);
//        } else {
//            System.out.println("deu problema");
//        }
    }

//    private static boolean abrirConexao () {
//          try {
//            String dbdriver = "org.postgresql.Driver";
//            String dburl = "jdbc:postgresql://localhost:5432/automedterca";
//            String dbuser = "postgres";
//            String dbsenha = "postgres";
//
//            // Carrega Driver do Banco de Dados
//            Class.forName(dbdriver);
//
//            if (dbuser.length() != 0) // conexão COM usuário e senha
//            {
//                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
//            } else // conexão SEM usuário e senha
//            {
//                conexao = DriverManager.getConnection(dburl);
//            }
//
//            return true;
//
//        } catch (Exception e) {
//            System.err.println("Erro ao tentar conectar: " + e);
//            return false;
//        }
//    }
}
