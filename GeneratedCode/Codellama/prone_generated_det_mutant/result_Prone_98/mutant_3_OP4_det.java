import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && false && true && true && true && false && true && true && true && false) {byte gitwnexp = -11;}else{byte mumgwodp = -17;}
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        System.out.println(message);
    
}
}