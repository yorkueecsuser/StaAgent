class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        int value = getValue(); // Added a method call to dynamically get a value
        switch (value) { // Unreachable switch statement added
            case 1:
                System.out.println("This case is never executed");
                break;
        }

        this.printName(); // Bug: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
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

    private int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }
}