class NullAssignmentBug {
    private Object myObject;

    public boolean getFalseCondition() {
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

        // Insert unreachable switch statement
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
            }
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