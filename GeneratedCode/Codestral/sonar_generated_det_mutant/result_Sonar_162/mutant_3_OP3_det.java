class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
if (true && true && false && false && true && true && false && false && true && false && false) {double ocltehwx = -470498600;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}