class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        return y;
    }
}

// Unreachable while loop mutation operator
class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT_Mutant_1 {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
        }
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return y;
    }
}