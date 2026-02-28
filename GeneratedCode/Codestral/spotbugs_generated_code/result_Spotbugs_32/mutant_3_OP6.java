class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) {  // Mutant: Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
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

    private boolean getCondition() {
        return false;  // The condition is always false, making the loop unreachable
    }
}