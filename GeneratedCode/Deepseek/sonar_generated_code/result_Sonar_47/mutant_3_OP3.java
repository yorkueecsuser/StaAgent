class Main {
    public static void main(String[] args) {
        if (false) { // Unreachable If Statement mutation
            showBug();
        }
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);
    }
}