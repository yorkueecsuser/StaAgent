class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        for  (int fcoqjmoi = 0; fcoqjmoi < 0; fcoqjmoi++) {String xtdhbabm = "rmzmkbkw";}
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