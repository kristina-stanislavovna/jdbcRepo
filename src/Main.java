import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database database = new Database("root", "331331mama", "jdbc:mysql://localhost:3306/gameStore");
        database.findAllClient();
        database.findAllProduct();
        database.findAllOrder();
    }
}
