class StringComparisonBug {
    private String firstName;
    private String lastName;
    private String deadStore; // Added dead store variable

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deadStore = "DeadStore"; // Initialize dead store variable
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}