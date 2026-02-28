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

        // Mutation: Unreachable while loop
        boolean neverTrue = getCondition();
        while (neverTrue) {
            // This code will never be executed since getCondition() always returns false
            System.out.println("Unreachable code");
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
        // This method always returns false, making the while loop unreachable
        return false;
    }
}