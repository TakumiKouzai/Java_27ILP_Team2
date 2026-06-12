import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListConverter {

    public void printUpperCaseUsers(List<String> users) {
        printUpperCaseList("ユーザー名（大文字変換）", users);
    }

    public void printUpperCaseOrders(List<String> orders) {
        printUpperCaseList("注文情報（大文字変換）", orders);
    }

    private void printUpperCaseList(String label, List<String> values) {
        List<String> upperCaseValues = convertToUpperCase(values);
        System.out.println(label + "： " + upperCaseValues);
    }

    private List<String> convertToUpperCase(List<String> values) {
        List<String> upperCaseValues = new ArrayList<>();

        for (String value : values) {
            upperCaseValues.add(value.toUpperCase(Locale.ROOT));
        }

        return upperCaseValues;
    }

    public static void main(String[] args) {
        ListConverter converter = new ListConverter();

        List<String> users = List.of("harry", "ron", "hermione");
        List<String> orders = List.of("order123", "order456", "order789");

        converter.printUpperCaseUsers(users);
        converter.printUpperCaseOrders(orders);
    }
}