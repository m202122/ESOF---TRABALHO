package sistema.de.controle.universidade;
import java.sql.*;
    public class ConectarAOBanco {
        private Connection connection;
        private Statement statement;
        public void ConectarBanco() {
            String url = "jdbc:postgresql://localhost:5432";
            String username = "postgres";
            String password = "overdose";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException cnfex) {
            System.err.println("Erro ao carregar o drive JDBC/ODBC");
            cnfex.printStackTrace();
            System.exit(1);
        } catch (SQLException sqlex) {
            System.out.println("Unable to connect");
            sqlex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Não foi possível conectar no Banco de dados", "Erro", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet query(String query) {
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return resultSet;
    }
    
    public int updatequery(String query) {
        int result = 1;
        try {
            statement = connection.createStatement();
            result = statement.executeUpdate(query);

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return result;
    }

    public void shutDown() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException sqlex) {
            System.err.println("Unable to disconnect");
            sqlex.printStackTrace();
        }
    }
}
