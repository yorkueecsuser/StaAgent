class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
int najwnkba = 0;switch  (najwnkba) {case 1:float mojlzgyg = 417810181;break;default:float ucrefoow = -84527507;break;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}