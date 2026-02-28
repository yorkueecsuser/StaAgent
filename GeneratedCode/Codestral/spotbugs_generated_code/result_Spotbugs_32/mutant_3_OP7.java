class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean unreachableCondition = false;
        while(unreachableCondition) {
            System.out.println("Unreachable code");
        }
        this.printName(); // Original bug: Uninitialized read of field in constructor (UR_UNINIT_READ)
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