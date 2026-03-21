class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        int ypihwbxm = 0;switch  (ypihwbxm) {case 1:double lkfdeios = -978118119;break;default:double ytxiyral = -644643780;break;}
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