class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        try {
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                throw new IllegalStateException("Unreachable code executed");
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