class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Method to determine the loop condition
    private boolean getCondition() {
        return false;
    }

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        // Inserted unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This code block is unreachable
            System.out.println("This is an unreachable loop.");
        }
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }
}