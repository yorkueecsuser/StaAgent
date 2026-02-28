class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        if(getCondition()) {
            System.out.println("This branch is unreachable.");
        } else {
            // BUG: Strings should be compared using "equals()"
            return firstName == lastName;
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}