class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Mutation: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable.");
        }
        
        return sb.toString();
    }

    // Helper method to return false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}