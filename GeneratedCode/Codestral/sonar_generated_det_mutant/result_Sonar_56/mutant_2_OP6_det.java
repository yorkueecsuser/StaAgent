class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        for  (int ilrtizph = 0; ilrtizph < 0; ilrtizph++) {int zhjkpfoq = 208276031;}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}