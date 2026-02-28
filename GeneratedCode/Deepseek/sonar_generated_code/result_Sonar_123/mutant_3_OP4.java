import java.lang.Integer;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int j = 0; // Initialize j to 0
        while (true) {
            j++;
            // BUG: Loops should not be infinite
            if (j == Integer.MAX_VALUE) {  // j is incrementing till it reaches Integer.MAX_VALUE
                break;
            }

            // Mutant: Unreachable if-else statement
            // This code branch will never be executed because the condition is always false
            if (false) {
                int unreachableVariable = 0;
                System.out.println("This code will never execute, because it's unreachable");
            }
        }
    }
}