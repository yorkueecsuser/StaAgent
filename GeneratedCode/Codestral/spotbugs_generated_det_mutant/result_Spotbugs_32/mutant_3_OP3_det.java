class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        if (false && true && false && true && false && true && true && false && true && true && false) {long czhgxjwx = 933704674;}
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