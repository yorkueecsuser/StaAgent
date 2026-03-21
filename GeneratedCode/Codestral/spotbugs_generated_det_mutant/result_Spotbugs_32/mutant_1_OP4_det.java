class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        if (true && true && true && false && true && false && false && false && true && false && false) {byte swhmexby = -34;}else{boolean sogokvec = true;}
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