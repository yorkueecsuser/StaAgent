import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        if (true && true && true && true && false && false && false && false && false && false && false) {double sagdlvse = -414283177;}else{short iidefgdi = -1061;}
        System.out.println(message);
    
}
}