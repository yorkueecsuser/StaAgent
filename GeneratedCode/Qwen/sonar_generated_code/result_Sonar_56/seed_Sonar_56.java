class StringComparisonBug {

    public boolean showBug(String firstName, String lastName) {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName; 
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("John", "John")); // Expected false due to bug
        System.out.println(bugDemo.showBug("John", "Doe"));  // Expected false due to bug
    }
}