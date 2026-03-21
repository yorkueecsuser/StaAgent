class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
if (false && false && false && false && true && true && true && true && true && true && false) {long eohwrmfz = 537210475;}else{byte hlwuvzqs = -27;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}