import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] mvaiibqj = {"Alice", "Bob", "Charlie"};
        String wnaozbil = String.format("Hello, %s", mvaiibqj[0], mvaiibqj[1], mvaiibqj[2]);
        System.out.println(wnaozbil);
    }
}