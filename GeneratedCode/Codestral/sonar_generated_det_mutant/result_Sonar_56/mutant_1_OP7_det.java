class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        boolean akipjbno = false;while (akipjbno && false && true && true && true && false && true && true && false && true && false && false) {String iekeszwo = "ceueaxma";}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}