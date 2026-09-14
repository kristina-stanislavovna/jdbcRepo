import java.sql.SQLException;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {
    private Database database;

    public ClientRepositoryImpl(Database database) {
        this.database = database;
    }
//
//    @Override
//    public void longName() throws SQLException {
//        List<Client> clients = database.findAllClient();
//        String name = clients.get(0).getName();
//        String longName = "";
//        for (int i = 0; i < clients.size(); i++) {
//            if (name.length() < clients.get(i).getName().length()) {
//                longName = clients.get(i).getName();
//            }
//        }
//        String reverse = "";
//        for (int i = longName.length() - 1; i >= 0; i--) {
//            reverse += longName.charAt(i);
//        }
//
//        System.out.println("Reversed Long name: " + reverse);
//
//    }
}
