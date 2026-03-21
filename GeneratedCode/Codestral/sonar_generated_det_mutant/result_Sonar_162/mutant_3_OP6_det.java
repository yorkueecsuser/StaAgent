class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
for  (int mdhfxnih = 0; mdhfxnih < 0; mdhfxnih++) {double qdisyakx = -65689003;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}