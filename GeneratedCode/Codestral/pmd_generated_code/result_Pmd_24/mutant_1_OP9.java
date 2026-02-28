// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    // Mutation: Changed the access modifier of the clone method from protected to private
    private Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}