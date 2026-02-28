class DeadStore {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        int x = 0; // Dead store added
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}