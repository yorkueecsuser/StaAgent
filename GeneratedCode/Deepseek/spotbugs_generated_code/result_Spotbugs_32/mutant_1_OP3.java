class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        // Adding unreachable if statement
        if (unreachableCondition()) {
            System.out.println("Unreachable block");
        } else {
            this.printName(); // Original bug still present
        }
    }

    private boolean unreachableCondition() {
        return false; // Always false to make the block unreachable
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