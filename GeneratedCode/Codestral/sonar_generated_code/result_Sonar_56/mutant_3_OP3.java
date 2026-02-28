class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private boolean alwaysFalse() {
        return false;
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        boolean bug = firstName == lastName;
        if (alwaysFalse()) {
            // Unreachable if statement
            System.out.println("This line will never be executed.");
        }
        return bug;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}