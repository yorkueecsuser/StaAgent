class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sf = new StringBuffer('A');
        
        // Demonstrating the bug by appending to the StringBuilder and StringBuffer
        sb.append(" Test");
        sf.append(" Test");

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case
                break;
        }

        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch case is unreachable
        return false;
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}