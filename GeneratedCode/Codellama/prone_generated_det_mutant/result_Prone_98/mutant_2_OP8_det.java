import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] famdnjxe = {"Alice", "Bob", "Charlie"};
        String gtmcvsto = String.format("Hello, %s", famdnjxe[0], famdnjxe[1], famdnjxe[2]);
        System.out.println(gtmcvsto);
    }
}