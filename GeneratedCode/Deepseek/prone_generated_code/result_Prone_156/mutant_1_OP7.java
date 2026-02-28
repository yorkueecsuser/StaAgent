class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
        
        boolean condition = false;  // Mutation: Unreachable while loop
        while (condition) {}  // The condition of this while loop is always false, making it unreachable
    }
}