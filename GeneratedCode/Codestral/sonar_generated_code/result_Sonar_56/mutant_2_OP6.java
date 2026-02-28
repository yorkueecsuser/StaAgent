class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        // Mutated code using unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("This line is unreachable.");
        }

        // Original code
        return firstName.equals(lastName);
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print true
    }
}