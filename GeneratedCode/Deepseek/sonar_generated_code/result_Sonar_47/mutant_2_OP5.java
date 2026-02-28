class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean isConditionTrue = false; // Mutant Code: Unreachable Switch Statement
        switch (isConditionTrue? 1 : 0) {
            case 0:
                return str.matches(regex);
            default:
                break;
        }
        return str.matches(regex);
    }
}