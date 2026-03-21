class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
boolean hxuukldw = false;while (hxuukldw && false && true && true && false && true && false && false && true && false && false && false) {String epiqudcw = "nudzsdki";}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}