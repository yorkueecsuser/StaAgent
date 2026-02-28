class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static boolean showBug() {
        String regex = "(?:)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        String str = "";
        boolean result = str.matches(regex);

        // Mutation Operator: Unreachable for loop
        // The loop condition is always false to make it unreachable
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return result;
    }
}