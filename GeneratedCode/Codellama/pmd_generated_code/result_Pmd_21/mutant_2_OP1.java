class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        // Dead Store operator:
        // Introduce unused variable declaration with type string
        String s = "dead_store";
    }
}