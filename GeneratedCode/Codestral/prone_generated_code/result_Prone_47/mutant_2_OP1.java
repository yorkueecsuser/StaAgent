class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // This is correct usage as per bug rule
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        int deadStoreVariable = 10; // Dead Store: Adding an unused variable declaration

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}