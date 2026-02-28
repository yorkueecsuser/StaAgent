class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Inserting a dead store variable with a randomly generated name
        int abcdefgh = 42; // Dead Store
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}