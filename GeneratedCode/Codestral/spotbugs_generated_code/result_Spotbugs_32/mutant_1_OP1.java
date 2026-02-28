class UninitializedFieldBug {
    private String name;
    private int unusedVariable; // Added dead store variable

    public UninitializedFieldBug() {
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        unusedVariable = 123; // Assigning a value to the dead store variable
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