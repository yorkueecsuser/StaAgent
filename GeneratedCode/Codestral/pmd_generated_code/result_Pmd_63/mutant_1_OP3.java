class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;

        // Mutant: Unreachable if statement
        if (isUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable if statement");
        }

        // Assume some complex operation here
        //...
    }

    private boolean isUnreachableCondition() {
        return false; // This condition is always false, making the if statement unreachable
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }
}