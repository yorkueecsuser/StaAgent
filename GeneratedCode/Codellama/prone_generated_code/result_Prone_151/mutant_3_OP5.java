import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

// Unreachable switch statement mutant
        switch (0) { // switch expression is always 0
        case 1: // unreachable code
                System.out.println("Unreachable code executed");
                break;
        default: // unreachable code
                System.out.println("Default case executed");
                break;
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}