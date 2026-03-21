class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean fywcsych = false;while (fywcsych && true && false && true && true && true && false && true && false && true && false && false) {long kqgzggcl = -484627367;}
        this.printName(); // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
    
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