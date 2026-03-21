class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        if (false && false && false && true && true && true && true && false && true && true && false) {float qrweiktk = -216155271;}
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