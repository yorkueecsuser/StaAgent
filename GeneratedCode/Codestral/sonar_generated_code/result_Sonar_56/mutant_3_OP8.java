class StringComparisonBug {
    private String firstName;
    private String lastName;
    private String a; // Mutant: Renamed firstName to a

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.a = firstName; // Mutant: Assigned firstName to a
    }

    public boolean showBug() {
        // BUG: Strings should be compared using "equals()"
        return a == lastName; // Mutant: Compared a with lastName
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());
    }
}