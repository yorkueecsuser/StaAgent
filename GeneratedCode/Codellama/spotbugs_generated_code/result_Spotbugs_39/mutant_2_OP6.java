class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Unreachable for loop mutation
    public void unreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This statement is unreachable");
        }
    }
}