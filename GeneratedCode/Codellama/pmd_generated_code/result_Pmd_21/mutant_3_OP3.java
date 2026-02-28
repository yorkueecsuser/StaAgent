class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        if (getCondition()) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}