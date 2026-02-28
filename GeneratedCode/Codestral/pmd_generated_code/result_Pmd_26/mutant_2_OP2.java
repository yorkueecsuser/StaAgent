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

        // Mutation: Duplicating a randomly selected assignment statement
        Object duplicateClonedObject = clonedObject; // Duplicated assignment statement

        return clonedObject;
    }
}