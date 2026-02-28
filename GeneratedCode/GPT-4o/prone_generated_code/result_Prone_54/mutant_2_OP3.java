class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString

        // Inserting an unreachable if statement using a non-final variable
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    // Method that returns a false condition ensuring it's unreachable
    private boolean getUnreachableCondition() {
        return Math.random() < 0; // Always false because the probability is 0
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}