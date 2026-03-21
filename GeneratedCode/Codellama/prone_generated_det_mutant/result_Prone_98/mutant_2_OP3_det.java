import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        if (true && true && false && true && false && true && false && true && true && true && false) {float vfpdeweg = -706177513;}
        System.out.println(message);
    
}
}