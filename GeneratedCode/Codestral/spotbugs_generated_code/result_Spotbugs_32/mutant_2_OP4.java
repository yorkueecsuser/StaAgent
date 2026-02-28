class UninitializedFieldBug {
    private String name;
    private boolean unreachableBranchCondition() {
        return false;
    }

    public UninitializedFieldBug() {
        if (unreachableBranchCondition()) {
            System.out.println("This line will never be executed");
        }
        this.printName();
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