class StringComparisonBug {
    private String firstName;
    private String lastName;
    private String unusedVar; // Dead store mutation: Unused variable declaration

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.unusedVar = "deadstore"; // Dead store mutation: Initialization of the unused variable
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return firstName.equals(lastName);
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print true now
    }
}