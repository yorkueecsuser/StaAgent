class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition();
        if (condition) {
            // This code will never be executed as the condition is always false
            System.out.println("This code will never be executed because the condition is always false");
        }
    }
    
    // A non-final method to return false
    public static boolean getCondition() {
        return false;
    }
}