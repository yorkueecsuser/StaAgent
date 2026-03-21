class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        if (true && true && false && true && false && false && true && true && true && false && false) {String ergijmlo = "fovhwyzp";}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}