/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fabiomacz
 */
public class ConexaoMySQL {

    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    private static final String URL_BANCO = "jdbc:mysql://localhost:3306/agenda";

    public static Connection ConexaoBD() throws Exception {
        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        //Cria a conexao com o banco de dados
        java.sql.Connection conexao = DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);

        return conexao;
    }

}
