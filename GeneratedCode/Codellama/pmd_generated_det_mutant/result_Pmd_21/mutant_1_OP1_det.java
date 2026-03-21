class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char opavwfgs = 'c';
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
    
}
}