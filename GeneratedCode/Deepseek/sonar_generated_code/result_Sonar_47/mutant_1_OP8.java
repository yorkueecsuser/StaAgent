class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);
    }

    public static boolean showNoBug() { // Mutated method name
        String regex = "(?:)*"; // Existing code
        String str = "";
        return str.matches(regex);
    }
}