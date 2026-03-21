class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        if (true && true && true && true && true && true && false && false && true && true && false) {char pvvrggjo = 'j';}else{long okvujxxi = 779454606;}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}