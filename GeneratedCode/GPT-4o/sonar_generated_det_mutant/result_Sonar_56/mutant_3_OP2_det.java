class StringComparisonBugDemo {

    // Method to get a first name, for demonstration purposes
    private String getFirstName() {
        return "John";
    }

    // Method to get a last name, for demonstration purposes
    private String getLastName() {
        return "Doe";
    }

    // Public method to show the bug
public boolean showBug() {
    String firstName = getFirstName();
    String lastName = getLastName();
    lastName = getLastName();
    return firstName == lastName;
}

    public static void main(String[] args) {
        StringComparisonBugDemo demo = new StringComparisonBugDemo();
        boolean result = demo.showBug();
        System.out.println("Are the names the same? " + result);
    }
}