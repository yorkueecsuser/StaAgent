class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
public static void main(String [] args){
    VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
    example = new VariableSelfAssignmentExample();
    System.out.println("Resulting Name: " + example.showBug("Alice"));
}
}