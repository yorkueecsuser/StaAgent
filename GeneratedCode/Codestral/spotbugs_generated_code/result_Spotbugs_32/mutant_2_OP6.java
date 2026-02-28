class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("This line will never be printed.");
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
}