class NullAssignmentBug {
    private Object myObject;
    private boolean getFalseCondition() { return false; }

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;

        // Added mutant: Unreachable switch statement
        int value = getFalseCondition()? 1 : 0;
        switch (value) {
            case 1:
                // This case will never be executed
                System.out.println("Unreachable case executed");
                break;
            default:
                // This is the only case that will be executed
                break;
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