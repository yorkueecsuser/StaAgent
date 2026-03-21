class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        int ohubdzcz = 0;switch  (ohubdzcz) {case 1:String equdgxvw = "gqotpvop";break;default:double azbkmykp = -971876741;break;}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}