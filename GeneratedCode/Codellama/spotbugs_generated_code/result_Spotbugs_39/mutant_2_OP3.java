class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Unreachable if statement mutant
    public void unreachableIf() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}