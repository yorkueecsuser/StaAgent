class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case
                System.out.println("This is the default case.");
                break;
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the switch condition dynamically determined
    }

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}