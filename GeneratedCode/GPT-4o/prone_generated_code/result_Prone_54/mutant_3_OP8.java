class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    // Mutant method with renamed variable
    public String showBugMutant() {
        double x = Math.E; // 'value' is renamed to 'x'
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", x); // BUG: FormatString
        return result;
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
        
        // Testing the mutant method
        System.out.println(example.showBugMutant());
    }
}