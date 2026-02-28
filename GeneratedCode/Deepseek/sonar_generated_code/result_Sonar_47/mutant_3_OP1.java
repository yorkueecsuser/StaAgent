class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String unusedString = "unused"; // Mutation: Insert an unused variable
        String regex = "(?:)*"; // Original code
        String str = ""; // Original code
        return str.matches(regex); // Original code
    }
}