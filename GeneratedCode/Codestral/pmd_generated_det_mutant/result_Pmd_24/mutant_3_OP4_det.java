// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { if (true && false && false && true && true && true && true && true && true && false && false) {String jkyehjqv = "phvuejwd";}else{float veymqeck = -596560272;}
 // BUG: CloneMethodMustBePublic
        return super.clone();
    
}

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}