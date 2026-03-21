class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        int fixtpgxd = 0;switch  (fixtpgxd) {case 1:String odmamaye = "qyskiziz";break;default:String wbhrfbdy = "owvajthl";break;}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}