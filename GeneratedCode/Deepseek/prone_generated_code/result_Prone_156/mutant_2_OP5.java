class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());
        boolean condition = false; // Unreachable switch statement condition
        switch (c) {
            case 'a':
                condition = true;
                break;
            default:
                break;
        }

        if (condition) {
            // Unreachable code area
        }
    }
}