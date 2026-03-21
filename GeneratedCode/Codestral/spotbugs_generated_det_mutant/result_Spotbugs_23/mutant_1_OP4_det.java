class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (false && true && true && false && true && false && false && true && true && true && false) {boolean oubvtjhm = true;}else{String ptevzwuq = "cymioznm";}
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