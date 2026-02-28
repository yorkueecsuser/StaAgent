class BuggyCloneMethod implements Cloneable {
    @Override
    protected Object clone() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            System.out.println("This line is unreachable");
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