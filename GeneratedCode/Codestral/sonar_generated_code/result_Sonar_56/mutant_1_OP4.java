class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return firstName.equals(lastName);
    }

    public boolean unreachableBug() {
        boolean condition = false;
        if (condition) {
            // This branch is unreachable due to the condition being false
            System.out.println("Unreachable branch");
        } else {
            System.out.println("Reachable branch");
        }
        return condition;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print true
        buggyCode.unreachableBug();   // This will print "Reachable branch"
    }
}