import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrdiniDao {

    private final String dbUrl = "jdbc:mysql://localhost:3306/esercizioMichele07_09";
    private final String user = "root";
    private final String password = "Ferrinico92";


    public void insertOrdine(Ordini ordine) throws SQLException{
        Connection conn = DriverManager.getConnection(dbUrl, user, password);
        Statement statement = conn.createStatement();

        String ordine1 = ""
                + "INSERT INTO esercizioMichele07_09.clienti "
                + "(cliente_id, prodotto,quantita,data_ordine) "
                + "VALUES('" +  + "', '" + ordine.getProdotto() + "', '" +ordine.getQuantita() + "', '" +ordine.getDataOrdine() + "' );";

        statement.executeUpdate(ordine1);

        conn.close();
    }
}
