// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // BUG: CloneMethodMustBePublic
        /* Mutated Java code for the Unreachable switch statement */
        int value = -1;  // any value that is not used as a case will make it unreachable
        switch (value) {
            case 0:
                System.out.println("This line will never be executed.");
                break;
        }
        /* End of Mutated Java code */
        return super.clone();
    }

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}