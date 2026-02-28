class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sf = new StringBuffer('A');
        
        // Demonstrating the bug by appending to the StringBuilder and StringBuffer
        sb.append(" Test");
        sf.append(" Test");
        
        // Mutant code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            sb.append(" This will never be appended");
        } else {
            // This block will always execute
            sb.append(" This will always be appended");
        }
        
        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}