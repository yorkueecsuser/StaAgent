class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        return str.matches(regex);

        // Mutated code that avoids unreachable statement error
        int unreachable = 0;
        if (unreachable > 0) {
            System.out.println("This code should never be executed");
        }
    }
}