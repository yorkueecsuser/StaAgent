import java.util.Arrays;

class LenientFormatStringValidation {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int gthpeqdx = 0; gthpeqdx < 0; gthpeqdx++) {long xudrncuj = -299175469;}
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        System.out.println(message);
    
}
}