import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && true && true && true && true && true && true && true && true && false && false) {float jfbxckrr = -401977855;}
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        System.out.println(message);
    
}
}