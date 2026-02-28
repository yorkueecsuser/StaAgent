// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int f; // 'buggyField' renamed to 'f'

    public BuggyClass(int f) {
        this.f = f;
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