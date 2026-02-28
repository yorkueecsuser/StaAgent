class BuggyClass implements Cloneable {

    private int buggyField;
    private int deadStoreVariable; // Mutant added: Dead Store

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
        this.deadStoreVariable = 0; // Initialized the dead store variable
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object showBug() throws CloneNotSupportedException {
        this.deadStoreVariable = 1; // Mutant: Use of dead store variable
        return this.clone();
    }
}