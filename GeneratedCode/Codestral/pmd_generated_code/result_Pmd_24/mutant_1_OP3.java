class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Mutated code: Inserted unreachable if statement
    public Object showBug() throws CloneNotSupportedException {
        if (isUnreachable()) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        }
        return this.clone();
    }

    private boolean isUnreachable() {
        return false;
    }
}