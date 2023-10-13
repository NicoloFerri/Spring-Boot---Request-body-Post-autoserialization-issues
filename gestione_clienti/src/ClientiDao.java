import java.sql.*;

public class ClientiDao {
    private final String dbUrl = "jdbc:mysql://localhost:3306/esercizioMichele07_09";
    private final String user = "root";
    private final String password = "Ferrinico92";


    public Integer insertCliente(Clienti cliente) throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, user, password);
        Statement statement = conn.createStatement();


        String cliente1 = ""
                + "INSERT INTO esercizioMichele07_09.clienti "
                + "(nome, cognome, email) "
                + "VALUES('" + cliente.getNome() + "', '" + cliente.getCognome() + "', '" + cliente.getEmail() + "');";

        PreparedStatement ps = conn.prepareStatement(cliente1,
                Statement.RETURN_GENERATED_KEYS);

        ps.execute();

        ResultSet rs = ps.getGeneratedKeys();
        int generatedKey = 0;
        if (rs.next()) {
            generatedKey = rs.getInt(1);
        }


        conn.close();
        return generatedKey;

    }

}