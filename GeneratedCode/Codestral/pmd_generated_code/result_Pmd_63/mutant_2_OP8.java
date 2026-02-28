class NullAssignmentBug {
    private Object myObject;
    private Object z;  // New variable

    public void initializeObject() {
        myObject = new Object();
        z = myObject;  // Assigning the new variable
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable
        myObject = null;
        z = null;  // Assigning null to the new variable

        // Assume some complex operation here
        //...
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return z;  // Returning the new variable
    }
}