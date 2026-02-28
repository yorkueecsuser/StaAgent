class UninitializedFieldBug {
    private String name;
    private String deadStore; // Dead Store mutation

    public UninitializedFieldBug() {
        this.deadStore = "unused"; // Assigning a value to the dead store
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
}