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

        // Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("This line will never be executed");
                    break;
            }
        }

        return clonedObject;
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}