// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;
    private int r; // Mutant: Renamed buggyField to r

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
        this.r = buggyField; // Mutant: Updated the new variable r with the value of buggyField
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    // Mutant: Added a new method that uses the renamed variable
    public int getRenamedField() {
        return this.r;
    }
}