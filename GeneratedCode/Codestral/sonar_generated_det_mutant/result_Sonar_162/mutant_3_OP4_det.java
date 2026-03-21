class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
if (true && false && false && true && true && true && true && true && true && false && false) {String ewzzvtyy = "rbjuopze";}else{int nljhkayq = 360706550;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}