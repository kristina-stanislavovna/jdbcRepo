import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Database database = new Database("root", "331331mama", "jdbc:mysql://localhost:3306/gameStore");
        database.findAllClient();
        database.findAllProduct();
        database.findAllOrder();

        /*Сделай два репозитории для юзеров и для клиентов виде интерфейса
        затем создать или за этих двух интерфейсов которые будут
         подвязаны базе данных через JDBC*/

        /*Создать метод который будет находить пользователя самый длинный
        name возвращать этот name при этом переворачиваю его задом наперёд*/

        /*Создать метод который будет возвращайте тебе данных где будет название
         группы продутлов и общий баланс эти группах*/

        /*Создать метод который будет возвращать общее количество всех
        пользователей логин и пароль которых содержит чётные количество цифр*/

        /*Создать метод который будет возвращать самого дорогого клиента который заканчивается на букву икс*/

        /*Сказать метод который будет возвращать всех клиентов при этом диапазон
        их балансов будет задаваться из двух файлов*/

        ClientRepository clientRepository =  new ClientRepositoryImpl(database);
//        clientRepository.longName();
       List<GanreSumDto> ganreSumDtoList =  database.productSumByGroupGanre();
        System.out.println("!!! +  " + ganreSumDtoList);
    }
}
