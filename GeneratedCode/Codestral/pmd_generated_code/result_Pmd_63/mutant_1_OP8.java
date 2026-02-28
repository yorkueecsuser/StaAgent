class NullAssignmentBug {
    private Object myObject;
    private Object r; // Newly added variable

    public void initializeObject() {
        myObject = new Object();
        r = myObject; // Newly added assignment
    }

    public void demonstrateBug() {
        // Assigning null to the newly added variable
        r = null;
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return r; // Returning the newly added variable
    }
}