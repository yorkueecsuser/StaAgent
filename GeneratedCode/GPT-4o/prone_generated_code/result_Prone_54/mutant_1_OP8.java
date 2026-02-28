class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    }
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}

// Mutant version of the original code with renamed variable
class FormatStringBugExampleMutant {

    public String showBugMutant() {
        double x = Math.E; // Renamed variable 'value' to 'x'
        // Attempting to format a double with an unknown conversion specifier 'r'
        String outcome = String.format("Formatted value: %r", x); // Renamed variable 'result' to 'outcome'
        return outcome;
    }
    
    public static void main(String[] args) {
        FormatStringBugExampleMutant exampleMutant = new FormatStringBugExampleMutant();
        System.out.println(exampleMutant.showBugMutant());
    }
}