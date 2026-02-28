class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        boolean condition = getCondition();
        if (condition) {
            // Added unreachable if branch
            System.out.println("This code is unreachable");
        }
    }

    // Method to inject non-final variable or equivalent method call in mutation operator
    private static boolean getCondition() {
        return false;
    }
}