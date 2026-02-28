class BuggyCloneMethod implements Cloneable {
    private boolean getFalseCondition() { // Method that always returns false
        return false;
    }

    @Override
    protected Object clone() {
        try {
            if (getFalseCondition()) {
                // Unreachable code
                Object unreachableObj = new Object();
                return unreachableObj;
            } else {
                return super.clone();
            }
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }
}