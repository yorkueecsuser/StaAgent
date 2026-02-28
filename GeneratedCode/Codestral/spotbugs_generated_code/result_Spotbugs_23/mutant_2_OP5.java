class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        boolean shouldRunSwitch = false;
        if (shouldRunSwitch) { // This condition is always false
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    break;
            }
        }
        return true;
    }

    public String getValue() {
        return value.length(); // This method returns the length of the value, which will never be 1
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }
}