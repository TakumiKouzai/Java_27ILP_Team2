import java.util.List;
import java.util.ArrayList;

public class ListConverter {

    public void convertUserList(List<String> users) {
        List<String> upperCaseUsers = new ArrayList<>();
        for (String user : users) {
            upperCaseUsers.add(user.toUpperCase());
        }
        System.out.println("ユーザー名（大文字変換）： " + upperCaseUsers);
    }

    public void convertOrderList(List<String> orders) {
        List<String> upperCaseOrders = new ArrayList<>();
        for (String order : orders) {
            upperCaseOrders.add(order.toUpperCase());
        }
        System.out.println("注文情報（大文字変換）： " + upperCaseOrders);
    }

    public static void main(String[] args) {
        ListConverter converter = new ListConverter();

        List<String> users = List.of("harry", "ron", "hermione");
        List<String> orders = List.of("order123", "order456", "order789");

        converter.convertUserList(users);
        converter.convertOrderList(orders);
    }
}