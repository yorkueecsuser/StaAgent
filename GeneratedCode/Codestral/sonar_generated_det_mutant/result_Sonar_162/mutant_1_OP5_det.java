class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
int lnrkmgyr = 0;switch  (lnrkmgyr) {case 1:String jwwqucwn = "liynicgq";break;default:int ruhsqtfz = -797945997;break;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}