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

        // Added unreachable if statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This line should never be reached.");
        }

        return clonedObject;
    }
}