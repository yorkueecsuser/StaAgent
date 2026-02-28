class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        if (false) {
            // unreachable code
            System.out.println("This is unreachable code");
        } else {
            // reachable code
            System.out.println("This is reachable code");
        }
    }
}