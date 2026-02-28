class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Mutation: Unreachable if-else statement
        boolean shouldRun = true;
        if (shouldRun) {
            int unreachable = 10; // This is an unreachable line of code
        } else {
            int reachable = 20; // This is a reachable line of code
        }

        System.out.println(reachable);
    }
}