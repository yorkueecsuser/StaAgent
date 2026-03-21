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
        if (false && true && false && true && false && true && true && true && true && false && false) {int fyrykzgz = 188185527;}
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