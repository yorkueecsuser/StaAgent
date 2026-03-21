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
        boolean olkmtheq = true;
        String firstName = getFirstName();
        String lastName = getLastName();

        // Bug: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName; // BUG: Strings and Boxed types should be compared using "equals()"
    
}

    public static void main(String[] args) {
        StringComparisonBugDemo demo = new StringComparisonBugDemo();
        boolean result = demo.showBug();
        System.out.println("Are the names the same? " + result);
    }
}