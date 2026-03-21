class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        for  (int iiujimco = 0; iiujimco < 0; iiujimco++) {char kotkfuqh = 'a';}
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