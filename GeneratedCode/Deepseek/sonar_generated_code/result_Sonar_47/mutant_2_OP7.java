class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);
    }

    // Unreachable while loop
    private boolean getCondition() {
        while (false) {
            // This is an unreachable statement
            System.out.println("This is unreachable code inside an unreachable while loop.");
        }
        return false;
    }
}