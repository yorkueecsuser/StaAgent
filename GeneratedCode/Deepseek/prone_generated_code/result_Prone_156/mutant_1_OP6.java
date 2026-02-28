class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Mutation: Unreachable for loop
        for(int i = 0; false; i++) {
            System.out.println("This loop is unreachable.");
        }
    }
}