public class Product {
    private int id;
    private String name;
    private int price;
    private Ganre ganre;

    public Product(int id, String name, int price, Ganre ganre) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ganre = ganre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Ganre getGanre() {
        return ganre;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ganre=" + ganre +
                '}' + '\n';
    }
}
