class BuggyClass {
    private int value;

    public BuggyClass(int value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        if (getFalseCondition()) { // Unreachable if statement
            System.out.println("This line will never be executed");
        }

        BuggyClass buggyClass = (BuggyClass) obj;
        return this.equals(buggyClass);
    }

    public void showBug(BuggyClass other) {
        System.out.println(this.equals(other));
    }
}