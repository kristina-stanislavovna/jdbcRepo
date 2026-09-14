import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final String login;
    private final String password;
    private final String url;

    public Database(String login, String password, String url) {
        this.login = login;
        this.password = password;
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Database{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public List<Client> findAllClient() throws SQLException {
        String sql = "SELECT * FROM CLIENT";
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Client> clients = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int balance = resultSet.getInt("balance");
            LocalDate createdAdd = resultSet.getDate("createdAdd").toLocalDate();
            Client client = new Client(id, name, balance, createdAdd);
            clients.add(client);
        }
        return clients;
    }

    public void findAllProduct() throws SQLException {
        String sql = "SELECT * FROM PRODUCT";
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            Ganre ganre = Ganre.valueOf(resultSet.getString("ganre"));
            Product product = new Product(id, name, price, ganre);
            products.add(product);
        }
        System.out.println("Product: " + products);
    }

    public void findAllOrder() throws SQLException {
        String sql = "SELECT * FROM `ORDER`";
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Order> orders = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int client_id = resultSet.getInt("client_id");
            int product_id = resultSet.getInt("product_id");
            LocalDate createdAdd = resultSet.getDate("createdAdd").toLocalDate();
            Order order = new Order(id, client_id, product_id, createdAdd);
            orders.add(order);
        }
        System.out.println("Orders: " + orders);
    }

    public List<GanreSumDto> productSumByGroupGanre() throws SQLException, IOException {
        String sql = "SELECT ganre, sum(PRICE) as sumPrice FROM PRODUCT GROUP BY GANRE;";
        Connection connection = DriverManager.getConnection(url, login, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        FileWriter fileWriter = null;
        List<GanreSumDto> ganreSumDtosList = new ArrayList<>();
        while (resultSet.next()) {
            Ganre ganre = Ganre.valueOf(String.valueOf(resultSet.getString("ganre")));
            int sumPrice = resultSet.getInt("sumPrice");
            ganreSumDtosList.add(new GanreSumDto(ganre, sumPrice));
            fileWriter = new FileWriter(new File(ganre.name()));
            fileWriter.write("Ganre: " + ganre + '\n');
            fileWriter.write("Sum price: " + sumPrice + '\n');
            fileWriter.flush();
            fileWriter.close();
        }
        return ganreSumDtosList;

    }
}
