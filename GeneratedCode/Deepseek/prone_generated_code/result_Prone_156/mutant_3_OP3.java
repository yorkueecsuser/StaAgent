class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
        
        // Mutation: Unreachable if statement
        boolean condition = false;
        if (condition) {
            System.out.println("This will never execute.");
        }
    }
}