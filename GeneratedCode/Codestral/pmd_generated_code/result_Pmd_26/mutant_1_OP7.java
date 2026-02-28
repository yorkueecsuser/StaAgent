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

        // Mutation: Inserting unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never execute because conditionWhile is always false
            System.out.println("This is an unreachable while loop.");
        }

        return clonedObject;
    }
}