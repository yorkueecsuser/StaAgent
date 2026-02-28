class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Mutant code added below
    public boolean isEqual(Object obj) {
        boolean equal = false;
        for (int i = 0; i < 10; i++) { // Unreachable for loop with always false condition
            equal = true;
        }
        return equal;
    }
}