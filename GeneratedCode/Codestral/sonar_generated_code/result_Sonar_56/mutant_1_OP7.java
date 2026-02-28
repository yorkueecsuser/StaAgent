class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        // Unreachable while loop mutant
        while (getCondition()) {
            // This code will never be executed
        }

        // Original code
        return firstName == lastName;
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}