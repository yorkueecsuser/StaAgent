class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
boolean kfkygmle = false;while (kfkygmle && false && true && true && true && true && true && false && false && true && true && false) {String fbfylbcf = "ysuioeqt";}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}