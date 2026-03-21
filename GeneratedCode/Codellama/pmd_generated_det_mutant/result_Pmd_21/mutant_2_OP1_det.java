class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        byte hvvqhsqj = -113;
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}