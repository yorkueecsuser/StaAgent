class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        try {
            // Inserted unreachable switch statement mutant
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    throw new RuntimeException("Unreachable code executed");
            }
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Helper method to ensure switch statement is unreachable
    private int getUnreachableValue() {
        return -1;
    }

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }
}