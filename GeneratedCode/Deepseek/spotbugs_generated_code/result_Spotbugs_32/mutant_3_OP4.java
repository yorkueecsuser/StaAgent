class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        }
    }

    private boolean getCondition() {
        return false; // always returns false to make the if branch unreachable
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