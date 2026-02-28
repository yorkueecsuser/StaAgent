class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");

        // Unreachable while loop
        while (false) {
            System.out.println("This is an unreachable while loop");
        }
    }
}