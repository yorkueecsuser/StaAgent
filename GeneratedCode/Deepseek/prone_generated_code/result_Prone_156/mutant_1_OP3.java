class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c = 'a';
        StringBuilder sb = new StringBuilder(c);  // BUG: StringBuilderInitWithChar
        System.out.println(sb.toString());

        // Added mutated code
        if (false) {
            System.out.println("This condition is always false.");
        }

        // Added mutated code that is unreachable
        if (getCondition()) {
            System.out.println("This condition can be either true or false.");
        }
    }

    // Added utility method that returns a random boolean value
    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}