class UninitializedFieldBug {
    private String name;
    private boolean getCondition() { return false; } // Added method to return a false condition

    public UninitializedFieldBug() {
        boolean shouldRun = getCondition(); // Using the false condition in if-else block
        if (shouldRun) {
            // This block is unreachable
            System.out.println("This block should not be executed.");
        } else {
            this.printName(); // Original bug: Uninitialized read of field in constructor (UR_UNINIT_READ)
        }
    }

    private void printName() {
        System.out.println("Name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBug() {
        UninitializedFieldBug bug = new UninitializedFieldBug();
        bug.setName("John");
        bug.printName();
    }
}