class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        if (false && true && true && true && false && true && false && true && true && false && false) {int akkxulfg = -49396095;}else{String momelghc = "hnosvtyf";}
        name = name; // BUG: Variables should not be self-assigned
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        System.out.println("Resulting Name: " + example.showBug("Alice"));
    }
}