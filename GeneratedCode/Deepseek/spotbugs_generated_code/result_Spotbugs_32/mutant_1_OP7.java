class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        this.printName(); // Original bug: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private void printName() {
        // New bug: Unreachable while loop
        boolean condition = false;
        while (condition) {
            System.out.println("This line is unreachable");
        }
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