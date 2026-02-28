class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        return firstName == lastName;
    }

    public boolean showMutant() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This block is unreachable due to the mutation operator.");
        }
        return showBug();
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
        System.out.println(buggyCode.showMutant()); // This will print the same output as showBug(), but with the unreachable if block
    }
}