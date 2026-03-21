class VariableSelfAssignmentExample {

    private String name;

    public void setName(String name) {
        int ixmcinsc = 0;switch  (ixmcinsc) {case 1:int whjpdzrh = 500842280;break;default:short hladyubb = -7020;break;}
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