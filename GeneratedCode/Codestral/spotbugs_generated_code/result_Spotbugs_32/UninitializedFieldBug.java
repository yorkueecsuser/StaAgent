class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        this.printName(); // ORIGINAL BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
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

    // MUTANT CODE: Equivalent Loop Replacement
    public void loopedPrintName() {
        do {
            this.printName(); // MUTANT BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        } while (false);
    }
}