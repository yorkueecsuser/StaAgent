class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        while (isUnreachable()) { } // Unreachable while loop

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

    private boolean isUnreachable() {
        return false; // Always returns false, making the while loop unreachable
    }
}