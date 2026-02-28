import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Unreachable switch statement mutant
        String value = getValue();
        switch (value) {
            case "Hello, World!":
                System.out.println("Hello, World!");
                break;
            default:
                break;
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }

    // Helper method to get a non-constant value
    public static String getValue() {
        return "Hello, World!";
    }
}