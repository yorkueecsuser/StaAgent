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
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        // Mutation: Duplicate the cloning operation
        Object duplicateClonedObject = buggyObject.clone();
        // The duplicateClonedObject is not used to avoid side effects
        return clonedObject;
    }
}