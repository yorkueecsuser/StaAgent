import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable
            System.out.println("This is unreachable code");
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}