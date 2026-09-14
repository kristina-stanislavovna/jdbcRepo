import java.time.LocalDate;

public class Client {
    private int id;
    private String name;
    private int balance;
    private LocalDate createdAdd;

    public Client(int id, String name, int balance, LocalDate createdAdd) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.createdAdd = createdAdd;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", createdAdd=" + createdAdd +
                '}' + '\n';
    }
}
