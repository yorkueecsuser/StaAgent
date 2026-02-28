class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        boolean condition = getCondition();
        if (condition) {
            // Unreachable branch
            return firstName == lastName;
        } else {
            // Original code
            return firstName.equals(lastName);
        }
    }

    private boolean getCondition() {
        // Returns false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print true
    }
}