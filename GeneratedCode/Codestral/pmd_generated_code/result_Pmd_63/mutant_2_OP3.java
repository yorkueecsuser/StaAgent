class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        if (checkCondition()) {
            myObject = null;
        } else {
            // Unreachable if statement mutant
            if (getUnreachableCondition()) {
                System.out.println("This line should never execute");
            }
        }

        // Assume some complex operation here
        //...
    }

    private boolean checkCondition() {
        // Implement your condition check logic here
        return true;
    }

    private boolean getUnreachableCondition() {
        // Implement your unreachable condition logic here
        return false;
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }
}