class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        if (true && false && false && true && false && false && true && true && true && true && false) {char gafygqhe = 'a';}else{short xffaxxmu = -3603;}
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