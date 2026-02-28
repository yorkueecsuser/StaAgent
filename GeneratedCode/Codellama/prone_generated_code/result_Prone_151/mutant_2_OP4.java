import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals

        // Mutant 1: Insert unreachable if-else branch into a randomly selected basic block in the program
        if (false) {
            // code that is never executed
        } else {
            // code that is always executed
        }
    }

    public static String showBug() {
        return "Hello, World!";
    }
}