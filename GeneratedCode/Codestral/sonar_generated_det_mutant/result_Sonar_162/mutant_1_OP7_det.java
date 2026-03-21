class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
boolean urgcnpwg = false;while (urgcnpwg && true && false && true && true && false && false && false && true && true && false && false) {double mhemqtyi = 528039175;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}