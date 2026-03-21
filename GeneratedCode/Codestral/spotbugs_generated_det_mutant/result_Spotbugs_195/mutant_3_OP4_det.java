// Java code demonstrating the bug: MC_OVERRIDABLE_METHOD_CALL_IN_CLONE
class BuggyClone implements Cloneable {
    private int value;

    public BuggyClone(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BuggyClone clone = (BuggyClone) super.clone();
        if (true && false && false && true && false && true && true && true && false && false && false) {int vzbhqamw = 302389662;}else{int qzgrupif = 640400766;}
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