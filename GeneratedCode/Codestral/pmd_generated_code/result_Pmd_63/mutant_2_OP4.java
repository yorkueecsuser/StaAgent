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

        // Added mutant: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code should never be executed.");
        } else {
            // Assume some alternative complex operation here
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