class StringBuilderBugExample {

    public String showBug(char initialChar) {
        // Incorrect use of StringBuilder with a character
        StringBuilder sb = new StringBuilder(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case should never be executed
                sb.append(" unreachable code");
                break;
            default:
                // Default case should also not be executed
                sb.append(" default unreachable code");
                break;
        }
        
        return sb.toString();
    }

    public String showBugWithStringBuffer(char initialChar) {
        // Incorrect use of StringBuffer with a character
        StringBuffer sb = new StringBuffer(initialChar); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" was intended as initial value");
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case should never be executed
                sb.append(" unreachable code");
                break;
            default:
                // Default case should also not be executed
                sb.append(" default unreachable code");
                break;
        }
        
        return sb.toString();
    }

    private int getUnreachableValue() {
        // Method to return a value that makes switch statement unreachable
        return 2; // This value does not match any case in the switch
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug('A'));
        System.out.println(example.showBugWithStringBuffer('B'));
    }
}