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

    public static void main(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBug("John", "John"));
    }

    // Mutated Code
    public String showBugMutant(String a, String b) {
        String firstName = a;
        String lastName = b;

        if (firstName == lastName) { // BUG: Strings and Boxed types should be compared using "equals()"
            return "Strings are the same object";
        } else {
            return "Strings are different objects";
        }
    }

    public static void mainMutant(String[] args) {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Demonstrate the bug using example strings
        System.out.println(example.showBugMutant("John", "John"));
    }
}