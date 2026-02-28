class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Mutation: Unreachable switch statement
        int switchValue = getUnreachableValue(); // Should always return a value that doesn't match any case
        switch (switchValue) {
            case 9999: // Arbitrary case that will never be reached
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case to ensure no compile-time errors
                break;
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }

    // This method ensures the switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // This value should not match any case in the switch
    }
}