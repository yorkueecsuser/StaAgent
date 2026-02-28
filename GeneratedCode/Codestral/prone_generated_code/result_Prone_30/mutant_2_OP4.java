class DangerousLiteralNullBug {
    private static void unsafeMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        } else if (getUnreachableCondition()) { // Unreachable branch added here
            System.out.println("Unreachable branch");
        }
    }

    private static boolean getUnreachableCondition() {
        return false; // Always return false to ensure unreachability
    }

    public static void showBug() {
        unsafeMethod(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}