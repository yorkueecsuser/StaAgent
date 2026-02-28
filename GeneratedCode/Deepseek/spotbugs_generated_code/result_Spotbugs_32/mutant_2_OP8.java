class UninitializedFieldBug {
    private String n; // Mutant: Renamed 'name' to 'n'

    public UninitializedFieldBug() {
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private void printName() {
        System.out.println("Name: " + n); // Updated to use the renamed variable
    }

    public void setName(String name) {
        this.n = name; // Updated to use the renamed variable
    }

    public void showBug() {
        UninitializedFieldBug bug = new UninitializedFieldBug();
        bug.setName("John");
        bug.printName();
    }
}