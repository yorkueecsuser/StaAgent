class DangerousLiteralNullBug {
    private static boolean getCondition() {
        return false;
    }

    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }

        // Mutant code: Unreachable if-else branch
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable");
        }
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}