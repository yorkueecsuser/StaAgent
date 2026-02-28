class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean conditionUnreachable = getCondition();
        if (conditionUnreachable) {
            return str.matches(regex);
        } else {
            return false; // This branch is unreachable
        }
    }

    // Dummy method to ensure the condition for unreachable branch is dynamic
    public static boolean getCondition() {
        return false;
    }
}