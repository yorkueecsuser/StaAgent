import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Unreachable if statement mutant
        if (false) {
            System.out.println("This branch is unreachable.");
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}