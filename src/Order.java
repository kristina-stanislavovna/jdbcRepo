import java.time.LocalDate;

public class Order {
    private int id;
    private int client_id;
    private int product_id;
    private LocalDate createdAdd;

    public Order(int id, int client_id, int product_id, LocalDate createdAdd) {
        this.id = id;
        this.client_id = client_id;
        this.product_id = product_id;
        this.createdAdd = createdAdd;
    }

    public int getId() {
        return id;
    }

    public int getClient_id() {
        return client_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public LocalDate getCreatedAdd() {
        return createdAdd;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", product_id=" + product_id +
                ", createdAdd=" + createdAdd +
                '}' + '\n';
    }
}
