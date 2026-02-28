import java.util.ArrayList;

class StringBuilderInitWithCharBug {
    public static void main(String[] args) {
        char ch = 'a';
        StringBuilder sb = new StringBuilder(ch);
        sb.append("hello");
        System.out.println(sb.toString());

        // Mutant 1: Unreachable if-else statement
        if (false) {
            System.out.println("Reachable code 1");
        } else {
            System.out.println("Reachable code 2");
        }

        // Mutant 2: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("Reachable code 3");
        } else {
            System.out.println("Reachable code 4");
        }
    }

    // Helper method to avoid unreachable statement error
    private static boolean getCondition() {
        return false;
    }
}