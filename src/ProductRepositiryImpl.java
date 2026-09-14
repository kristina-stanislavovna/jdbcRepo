import java.io.IOException;
import java.sql.SQLException;

public class ProductRepositiryImpl implements ProductRepository{
    private Database database;

    public ProductRepositiryImpl(Database database) {
        this.database = database;
    }




}
