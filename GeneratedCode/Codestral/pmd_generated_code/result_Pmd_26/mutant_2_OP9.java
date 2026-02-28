class BuggyCloneMethod implements Cloneable {
    @Override
    protected BuggyCloneMethod clone() { // Intentionally incorrect return type for CloneMethodReturnTypeMustMatchClassName bug
        try {
            return (BuggyCloneMethod) super.clone();
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