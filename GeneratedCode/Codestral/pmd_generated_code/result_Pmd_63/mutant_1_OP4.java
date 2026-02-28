class NullAssignmentBug {
    private Object myObject;

    // Method to get a condition for the unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;

        // Mutation: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Alternative code
            // Assume some complex operation here
            //...
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