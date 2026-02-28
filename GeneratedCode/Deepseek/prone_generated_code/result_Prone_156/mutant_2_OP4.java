class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        boolean shouldRun = false;  // Unreachable if-else condition
        if (shouldRun) {
            // unreachable code
            System.out.println("This code will never run.");
        } else {
            // unreachable code
            System.out.println("This code will also never run.");
        }
    }
}