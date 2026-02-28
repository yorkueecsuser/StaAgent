class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass); // BUG: EqualsReference - Infinite recursion
    }

    public void showBug(BuggyClass other) {
        int deadStoreVariable; // Dead store variable
        System.out.println(this.equals(other));
    }
}