import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Do nothing
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}