class UninitializedFieldBug {
    private String name;
    private String dummy; // Mutated code: Introduced a new variable to be renamed

    public UninitializedFieldBug() {
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private void printName() {
        System.out.println("Name: " + name);
    }

    public void setName(String n) {
        this.dummy = n; // Mutated code: Renamed the parameter to be used in the assignment
    }

    public void showBug() {
        UninitializedFieldBug bug = new UninitializedFieldBug();
        bug.setName("John"); // 'John' is assigned to the renamed variable
        bug.printName();
    }
}