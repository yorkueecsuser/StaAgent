class StringComparisonBug {
    private String firstName;
    private String lastName;
    private String a; // adding a mutant variable
    private String b; // adding a mutant variable

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.a = firstName; // assigning firstName to the mutant variable a
        this.b = lastName; // assigning lastName to the mutant variable b
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    public boolean showMutant() {
        // Mutant: Using the renamed variables for comparison
        return a.equals(b); // using equals() for comparison
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
        System.out.println(buggyCode.showMutant()); // This will print true, as the mutant code uses equals() for comparison
    }
}