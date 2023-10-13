import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Clienti cliente = new Clienti(null,"Mario","Rossi","mariorossi@gmail.com");
       ClientiDao clienteDao = new ClientiDao();


       try {
           Integer idCliente  = clienteDao.insertCliente(cliente);

           Ordini ordine = new Ordini(null,idCliente,"",2,new Date());
           OrdiniDao ordineDao = new OrdiniDao();
           ordineDao.insertOrdine(ordine);

       }catch(SQLException e){
           throw new RuntimeException(e);
        }



//        Ordini ordine = new Ordini(null,null,"",2,new Date());
//        OrdiniDao ordineDao = new OrdiniDao();
//
//
//        try {
//            Integer idCliente  = clienteDao.insertCliente(cliente);
//            ordine.setClienteId(idCliente);
//            ordineDao.insertOrdine(ordine);
//
//        }catch(SQLException e){
//            throw new RuntimeException(e);
//        }




    }

}