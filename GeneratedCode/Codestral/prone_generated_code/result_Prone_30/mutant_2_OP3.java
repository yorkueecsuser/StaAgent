class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) { // Mutant code: unreachable if statement
            System.out.println("This statement should never be executed");
        }
    }

    private static boolean falseCondition() {
        return false;
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}