class BuggyCloneMethod implements Cloneable {
    private boolean getCondition() {
        return false;
    }

    @Override
    protected Object clone() {
        try {
            if (getCondition()) {
                // Inserted unreachable if statement
                System.out.println("This line should not be executed");
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