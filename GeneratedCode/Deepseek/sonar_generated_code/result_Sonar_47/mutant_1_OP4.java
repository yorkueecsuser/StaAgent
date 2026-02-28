class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean alwaysFalse = false; // Mutation: Add an always false condition
        if (alwaysFalse) { // Mutation: Add an unreachable if-else statement
            return str.matches(regex);
        } else {
            return false; // Mutation: Add a return statement to the unreachable branch
        }
    }
}