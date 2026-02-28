class BuggyCloneMethod implements Cloneable {
    private boolean getUnreachableCondition() {
        // This method will always return false to ensure the condition is unreachable
        return false;
    }

    @Override
    protected Object clone() {
        try {
            if (getUnreachableCondition()) { // Unreachable if statement
                throw new CloneNotSupportedException("This branch is unreachable");
            }
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