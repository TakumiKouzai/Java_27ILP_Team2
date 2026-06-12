import java.util.List;
import java.util.ArrayList;

public class ListConverter {

   
    public void convertAndPrint(List<String> list, String label) {
        List<String> upperCaseOrders = new ArrayList<>();
        for (String item : list) {
            upperCaseOrders.add(item.toUpperCase());
        }
        System.out.println(label + upperCaseOrders);
    }

    public static void main(String[] args) {
        ListConverter converter = new ListConverter();

        List<String> users = List.of("harry", "ron", "hermione");
        List<String> orders = List.of("order123", "order456", "order789");

        converter.convertAndPrint(users, "ユーザー名(大文字変換) : ");
        converter.convertAndPrint(orders, "注文情報(大文字変換) : ");
    }
}


