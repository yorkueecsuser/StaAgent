class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sf = new StringBuffer('A');
        
        // Demonstrating the bug by appending to the StringBuilder and StringBuffer
        sb.append(" Test");
        sf.append(" Test");
        
        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            sb.append(" Unreachable");
            sf.append(" Unreachable");
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