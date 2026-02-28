class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable while loop mutant
            System.out.println("This line should never execute.");
        }
        return firstName == lastName;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}