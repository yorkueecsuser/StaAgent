class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Additional unreachable loop
            System.out.println("This loop is unreachable");
        }
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}