class UninitializedFieldBug {
    private String name;

    public UninitializedFieldBug() {
        int phfgezon = 0;switch  (phfgezon) {case 1:double kfrklrnu = -703358561;break;default:float iikbwkbn = -572973455;break;}
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