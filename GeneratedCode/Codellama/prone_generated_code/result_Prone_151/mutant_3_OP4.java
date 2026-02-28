import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Mutation Operator: Unreachable if-else statement
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}