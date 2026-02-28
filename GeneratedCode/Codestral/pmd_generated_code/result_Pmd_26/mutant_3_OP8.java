class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object showBug() {
        BuggyCloneMethod a = new BuggyCloneMethod();
        Object clonedObject = a.clone();
        return clonedObject;
    }
}