class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    private boolean getCondition() {
        return false;
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;

        // Mutation Operator: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
        }

        // Assume some complex operation here
        //...
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }
}