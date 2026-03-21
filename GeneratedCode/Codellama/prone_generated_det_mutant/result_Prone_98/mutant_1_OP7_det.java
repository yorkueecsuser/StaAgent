import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean fxytaflm = false;while (fxytaflm && false && false && false && false && true && false && false && false && true && true && false) {short pjnhxefu = -2722;}
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        System.out.println(message);
    
}
}