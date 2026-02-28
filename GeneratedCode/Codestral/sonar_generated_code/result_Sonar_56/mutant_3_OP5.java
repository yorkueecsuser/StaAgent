class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean getFalseValue() {
        return false;
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        boolean comparisonResult = firstName == lastName;

        // Mutant code: Unreachable switch statement
        if (getFalseValue()) {
            int value = 1;
            switch (value) {
                case 0:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return comparisonResult;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}