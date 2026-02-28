class NullAssignmentBug {
    private Object myObject;
    private Object x; // Mutant: Renaming'myObject' to 'x'

    public void initializeObject() {
        myObject = new Object();
        x = myObject; // Mutant: Assigning'myObject' to 'x'
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;
        x = null; // Mutant: Also assigning null to 'x'

        // Assume some complex operation here
        //...
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return x; // Mutant: Returning 'x' instead of'myObject'
    }
}