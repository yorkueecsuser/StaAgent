class StringComparisonBug {
    private String firstName;
    private String lastName;
    private String a; // Mutant code: new variable 'a' added

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.a = firstName; // Mutant code: assigning 'firstName' to 'a'
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    public boolean showMutant() {
        // Mutant code: using 'equals()' to compare 'a' and 'lastName'
        return a.equals(lastName);
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
        System.out.println(buggyCode.showMutant()); // This will print true, as the strings are compared correctly
    }
}