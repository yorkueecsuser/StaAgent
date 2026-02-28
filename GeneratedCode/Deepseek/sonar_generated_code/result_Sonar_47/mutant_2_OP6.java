class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Add code here to make it unreachable
        }
        return str.matches(regex);
    }
}