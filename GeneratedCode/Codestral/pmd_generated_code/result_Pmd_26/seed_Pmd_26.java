class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() { // Bug: CloneMethodReturnTypeMustMatchClassName
        try {
            return super.clone();
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