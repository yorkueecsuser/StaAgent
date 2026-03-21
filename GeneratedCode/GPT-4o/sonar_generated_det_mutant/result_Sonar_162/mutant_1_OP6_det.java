class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        for  (int tfrkdbvv = 0; tfrkdbvv < 0; tfrkdbvv++) {byte drykbfud = -51;}
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