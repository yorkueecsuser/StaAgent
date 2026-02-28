class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Duplicating the assignment statement as per the mutation operator description
        double duplicatedValue = Math.E; // Duplicate mutation without side effects
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}