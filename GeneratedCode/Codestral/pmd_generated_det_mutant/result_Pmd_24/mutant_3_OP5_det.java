// This is a Java class that implements the Cloneable interface but its clone method is not public as required
class BuggyClass implements Cloneable {

    private int buggyField;

    public BuggyClass(int buggyField) {
        this.buggyField = buggyField;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { int hemcmnrj = 0;switch  (hemcmnrj) {case 1:short eeubqxax = -4547;break;default:int ekmndxkf = 298425022;break;}
 // BUG: CloneMethodMustBePublic
        return super.clone();
    
}

    // This method is used to demonstrate the bug by calling the clone method of the object
    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}