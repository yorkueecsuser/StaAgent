class StringAndBoxedComparison {

    public String showBug(String str1, String str2) {
        String firstName = str1;
        String lastName = str2;

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    // Mutant method with a variable renamed
    public String showBugMutant(String a, String str2) {
        String firstName = a; // Renamed 'str1' to 'a'
        String lastName = str2;

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
        
        // Demonstrate the mutant method
        System.out.println(example.showBugMutant("John", "John"));
    }
}