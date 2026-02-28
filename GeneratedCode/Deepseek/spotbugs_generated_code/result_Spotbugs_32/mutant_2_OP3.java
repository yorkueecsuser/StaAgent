class UninitializedFieldBug {
    private String name;
    private boolean unreachableCondition = false;

    public UninitializedFieldBug() {
        if (unreachableCondition) {
            System.out.println("This code should never be executed.");
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