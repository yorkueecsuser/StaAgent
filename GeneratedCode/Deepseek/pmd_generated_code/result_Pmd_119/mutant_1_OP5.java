class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar

        // Mutation begins here
        int switchCondition = 1; // This ensures that the switch statement is never reached
        switch (switchCondition) {
            case 1:
                break;
            default:
                break;
        }
        // Mutation ends here
    }
}