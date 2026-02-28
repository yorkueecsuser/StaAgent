class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // Unreachable for loop
        boolean loopCondition = getFalseCondition();
        for (int i = 0; loopCondition; i++) {
            // This code block is unreachable
            System.out.println("This loop is unreachable");
        }

        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        return sb.toString();
    }

    // Method to return false for the unreachable loop condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}