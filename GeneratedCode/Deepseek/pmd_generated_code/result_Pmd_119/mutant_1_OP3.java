class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "hello world";
        int index = s.indexOf('d'); // BUG: UseIndexOfChar
        boolean condition = getCondition();
        if (condition) {
            // Additional code here to make the mutant live
        }
    }

    // Additional method to prevent unreachable code error
    public static boolean getCondition() {
        return false;
    }
}