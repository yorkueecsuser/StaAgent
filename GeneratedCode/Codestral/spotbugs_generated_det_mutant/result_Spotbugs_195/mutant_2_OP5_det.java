// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        int zkqoobbw = 0;switch  (zkqoobbw) {case 1:int adykyoje = -896729584;break;default:char mwrekceq = 's';break;}
        clone.setValue(10); // BUG: Calling overridable method setValue() from the clone() method
        return clone;
    
}

    // Overridable method
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void showBug() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) this.clone();
        System.out.println("Cloned value: " + clone.getValue());
    }
}