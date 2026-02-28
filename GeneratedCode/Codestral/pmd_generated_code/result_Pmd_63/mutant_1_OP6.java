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

        // Unreachable for loop mutation
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code is unreachable
            System.out.println("Unreachable for loop mutation");
        }

        // Assume some complex operation here
        //...
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }

    private boolean getCondition() {
        // Dynamically return the condition for the for loop
        return false;
    }
}