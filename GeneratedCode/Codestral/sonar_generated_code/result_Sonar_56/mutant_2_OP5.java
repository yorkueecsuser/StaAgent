class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        boolean shouldRun = false; // This is done to ensure the switch statement is unreachable
        if (shouldRun) {
            switch (firstName) {
                case "John":
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}