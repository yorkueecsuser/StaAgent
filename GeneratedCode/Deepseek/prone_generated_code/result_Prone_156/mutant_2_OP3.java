class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Mutation: Unreachable If Statement
        boolean shouldPrint = false;  // This ensures that code block inside if statement will never execute
        if (shouldPrint) {
            System.out.println("This line will never be printed");
        }
    }
}