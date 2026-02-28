class StringBuilderInitWithCharDemo {

    public String showBug(char inputChar) {
        // This line demonstrates the bug
        StringBuilder sb = new StringBuilder(inputChar); // BUG: StringBuilderInitWithChar
        sb.append(" is the initial size, not the character.");
        
        // Inserting an unreachable if statement as per the mutation operator
        boolean condition = getCondition(); // This method dynamically determines the condition
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return sb.toString();
    }

    // Method to dynamically determine the condition, ensuring the if-statement remains unreachable
    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        System.out.println(demo.showBug('A'));
    }
}