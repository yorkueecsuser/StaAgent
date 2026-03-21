class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        boolean jkmezgef = false;while (jkmezgef && false && true && true && false && true && true && false && true && true && false && false) {char ycdsfyja = 'c';}
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