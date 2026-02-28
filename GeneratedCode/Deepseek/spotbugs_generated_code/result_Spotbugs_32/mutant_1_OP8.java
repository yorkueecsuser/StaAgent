class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private void printName() {
        String n = name; // Mutation: Renaming the 'name' field to 'n'
        System.out.println("Name: " + n);
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