class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Mutation: Unreachable if-else statement
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            sb.append(" This will never be reached.");
        } else {
            sb.append(" This is always executed.");
        }

        return sb.toString();
    }

    private boolean getAlwaysFalseCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}