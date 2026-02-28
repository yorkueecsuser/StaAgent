class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));

        // Introducing unreachable if-else statement
        boolean runtimeCondition = getRuntimeCondition(); // dynamically determined condition
        if (runtimeCondition) {
            System.out.println("This code will never run.");
        } else {
            System.out.println("This code will always run.");
        }
    }

    // Method to simulate a dynamic condition
    public static boolean getRuntimeCondition() {
        return false;
    }
}