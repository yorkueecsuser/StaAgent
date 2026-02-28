class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    // Renaming variables
    public void renamedVariables() {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);
    }
}