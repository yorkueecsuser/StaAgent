class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        for (int i = 0; getUnreachableCondition(); i++) {
            // This for loop is unreachable since getUnreachableCondition() always returns false
        }
        this.printName(); // Original bug: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private boolean getUnreachableCondition() {
        return false;
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