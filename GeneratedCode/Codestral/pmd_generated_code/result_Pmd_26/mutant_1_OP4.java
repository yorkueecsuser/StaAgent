class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("This code should never execute.");
        } else {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }

    public Object showBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.clone();
        return clonedObject;
    }
}