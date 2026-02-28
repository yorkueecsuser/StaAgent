class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        myObject = null;

        // MUTATION: Unreachable if statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code should never run.");
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