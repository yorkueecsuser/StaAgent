class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            sb.append(" This will never be executed.");
        } else {
            // This block is always executed
        }
        
        return sb.toString();
    }
    
    // Method to provide condition for the unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}