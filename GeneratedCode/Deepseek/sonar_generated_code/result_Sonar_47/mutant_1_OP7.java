class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean condition = getCondition();
        while (condition) {
            condition = false;
        }
        return str.matches(regex);
    }

    public static boolean getCondition() {
        return false;
    }
}