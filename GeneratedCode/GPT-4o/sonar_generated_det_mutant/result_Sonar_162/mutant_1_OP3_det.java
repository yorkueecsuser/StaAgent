class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        if (true && true && true && false && true && false && false && false && true && true && false) {char akxfbszb = 'x';}
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