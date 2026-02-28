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
        this.value = buggyClass.value; // Duplicated assignment
        return this.equals(buggyClass); // Original assignment
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}