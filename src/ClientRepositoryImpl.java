import java.sql.SQLException;
import java.util.ArrayList;
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

    public List<CountLoginPasswordEven> countEvenClient() throws SQLException {
        List<CountLoginPasswordEven> x = database.countClientsByEven();
        int count = 0;
        CountLoginPasswordEven xx = null;
        List<CountLoginPasswordEven> y = new ArrayList<>();
        for (CountLoginPasswordEven countLoginPasswordEven : x) {
            if (countLoginPasswordEven.name().length() % 2 == 0 & countLoginPasswordEven.password().length() % 2 == 0) {
                count++;
                xx = new CountLoginPasswordEven(countLoginPasswordEven.name(), countLoginPasswordEven.password());
                y.add(xx);
            }
        }
        System.out.println("Count: " + count);

        return y;
    }

    public Client maxClient() throws SQLException {
        List<Client> clients = database.findAllClient();
        Client max = null;
        int maxBalance = clients.get(0).getBalance();
        for (Client client : clients) {
            if (maxBalance < client.getBalance() & client.getName().endsWith("x")) {
                max = client;
            }
        }
        return max;
    }


}
