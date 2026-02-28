class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    public String showBugMutant() {
        double a = Math.E; // Renamed 'value' to 'a'
        // Attempting to format a double with an unknown conversion specifier 'r'
        String b = String.format("Formatted value: %r", a); // Renamed 'result' to 'b'
        return b;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
        
        // Output from mutated method
        System.out.println(example.showBugMutant());
    }
}