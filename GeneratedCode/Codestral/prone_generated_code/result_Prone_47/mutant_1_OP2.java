class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
        this.value = value; // Mutant: Duplication of assignment statement

        if (obj == null || getClass()!= obj.getClass())
            return false;

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}