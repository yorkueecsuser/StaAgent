class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        switch (getRandomNumber()) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
            case 2:
                System.out.println("This is also an unreachable switch statement");
                break;
            default:
                System.out.println("This is the default case of the switch statement");
                break;
        }
    }

    public static int getRandomNumber() {
        return 0;
    }
}