class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            System.out.println("This should never print");
        }
        this.printName(); // Original bug: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private boolean falseCondition() {
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