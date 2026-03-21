class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (true && true && false && false && false && true && false && true && true && false && false) {double tprsawsf = 94739606;}
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    
}

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}