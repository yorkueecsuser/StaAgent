class AlwaysTrueClass {
    private String value;
    private String tempVariable; // Added new variable

    public AlwaysTrueClass(String value) {
        this.tempVariable = value; // Renamed variable
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return tempVariable; // Renamed variable
    }

    public void showBug(AlwaysTrueClass x) { // Renamed variable
        if (this.equals(x)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}