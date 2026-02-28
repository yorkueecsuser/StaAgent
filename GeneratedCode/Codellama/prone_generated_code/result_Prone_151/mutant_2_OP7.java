import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
        while (false) {
            // Unreachable while loop
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}