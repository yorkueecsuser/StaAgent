import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Unreachable while loop mutation
        while (false) {
            // do nothing
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}