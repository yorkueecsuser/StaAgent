class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        boolean xmvvqgiz = false;while (xmvvqgiz && false && false && true && true && false && true && false && true && true && false && false) {int pypvgpza = -568013235;}
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