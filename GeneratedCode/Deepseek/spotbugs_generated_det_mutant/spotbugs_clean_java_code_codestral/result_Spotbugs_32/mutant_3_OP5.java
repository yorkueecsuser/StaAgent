class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        int value = getValue(); // New line: Get a value dynamically
        switch (value) { // New line: Start of unreachable switch statement
            case 1:
                System.out.println("This code is unreachable"); // This code will never be executed
                break;
        }
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    }

    private int getValue() { // New method: Dynamically returns a value
        return -1;
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