class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Hello, world!");
        }
    }
}