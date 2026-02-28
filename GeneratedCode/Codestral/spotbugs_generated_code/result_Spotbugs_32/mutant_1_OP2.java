class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        this.printName(); // Original bug
        this.name = name; // Mutant: Duplicating the assignment statement
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