class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean showBug() {
        int value = getUnreachableValue(); // This method always returns -1
        switch (value) {
            case 1:
                // Code that will never be executed
                break;
        }
        // BUG: Strings should be compared using "equals()"
        return firstName == lastName;
    }

    private int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        System.out.println(buggyCode.showBug());   // This will print false, even though the strings are equal
    }
}