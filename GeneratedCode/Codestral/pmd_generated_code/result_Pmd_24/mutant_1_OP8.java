// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;
    private int a; // Mutation: Renaming buggyField to a

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
        this.a = buggyField; // Mutation: Using the renamed variable a
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}