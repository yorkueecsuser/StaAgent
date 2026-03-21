class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        int ltauopoe = 0;switch  (ltauopoe) {case 1:float jyvwpfwv = 386234989;break;default:int ebpokocb = 139606973;break;}
        name = name; // BUG: Variables should not be self-assigned
    
}

    public void showBug() {
        String name = "John Doe";
        setName(name);
        System.out.println(name); // Prints null
    }

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}