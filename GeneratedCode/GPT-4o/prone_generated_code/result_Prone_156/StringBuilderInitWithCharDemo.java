class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");

        // Introducing an unreachable while loop based on a dynamically determined condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This is unreachable code.");
        }

        return sb.toString();
    }

    // A method to dynamically determine the condition, always returning false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}