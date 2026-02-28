class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // Original statement
        myObject = null;

        // New statement: Duplication of the original statement
        myObject = null;

        // Assume some complex operation here
        //...
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }
}