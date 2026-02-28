class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Code inside the loop is unreachable
            System.out.println("This code is unreachable");
        }
    }
}