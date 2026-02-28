class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            System.out.println("Unreachable code");
        }
    }
}