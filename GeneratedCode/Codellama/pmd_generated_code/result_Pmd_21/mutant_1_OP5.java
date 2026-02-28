class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        switch (0) { // Unreachable switch statement mutant
            case 1:
                // code
                break;
            default:
                // code
        }
    }
}