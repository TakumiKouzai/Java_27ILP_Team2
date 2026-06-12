import java.util.List;
import java.util.stream.Collectors;

public class ListConverter {

    // 共通処理
    private void convertAndPrint(List<String> list, String label) {
        List<String> upperCaseList = list.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());

        System.out.println(label + "： " + upperCaseList);
    }

    public void convertUserList(List<String> users) {
        convertAndPrint(users, "ユーザー名（大文字変換）");
    }

    public void convertOrderList(List<String> orders) {
        convertAndPrint(orders, "注文情報（大文字変換）");
    }

    public static void main(String[] args) {
        ListConverter converter = new ListConverter();

        List<String> users = List.of("harry", "ron", "hermione");
        List<String> orders = List.of("order123", "order456", "order789");

        converter.convertUserList(users);
        converter.convertOrderList(orders);
    }
}