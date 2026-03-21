class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
if (false && true && true && false && true && false && true && true && false && true && false) {byte shmvmslu = 48;}else{char lcrvbmem = 'w';}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}