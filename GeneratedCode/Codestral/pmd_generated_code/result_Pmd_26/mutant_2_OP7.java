class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() { // Bug: CloneMethodReturnTypeMustMatchClassName
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This while loop is unreachable
            System.out.println("This code should not be executed.");
        }

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
}