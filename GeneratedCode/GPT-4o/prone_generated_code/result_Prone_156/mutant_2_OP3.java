class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");

        // Mutation: Inserting an unreachable if statement
        boolean condition = getCondition(); // dynamically determining the condition
        if (condition) {
            System.out.println("This statement is unreachable.");
        }

        return sb.toString();
    }

    // Method to dynamically determine the condition for the unreachable statement
    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}