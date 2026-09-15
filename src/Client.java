import java.time.LocalDate;

public class Client {
    private int id;
    private String name;
    private int balance;
    private LocalDate createdAdd;
    private Type_Client typeClient;
    private String password;

    public Client(int id, String name, int balance, LocalDate createdAdd, Type_Client typeClient, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.createdAdd = createdAdd;
        this.typeClient = typeClient;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDate getCreatedAdd() {
        return createdAdd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type_Client getTypeClient() {
        return typeClient;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", createdAdd=" + createdAdd +
                ", typeClient=" + typeClient +
                ", password='" + password + '\'' +
                '}' + '\n';
    }
}
