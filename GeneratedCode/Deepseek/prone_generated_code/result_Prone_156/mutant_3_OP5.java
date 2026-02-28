class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Unreachable Switch Statement
        boolean shouldAddMutant = true;
        if (!shouldAddMutant) {
            switch(getValue()) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    System.out.println("Default case");
            }
        }
    }

    public static int getValue() {
        return 0;
    }
}