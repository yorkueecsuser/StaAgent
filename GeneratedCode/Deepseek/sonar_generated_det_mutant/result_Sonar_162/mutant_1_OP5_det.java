class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        int aodmeale = 0;switch  (aodmeale) {case 1:short bxkeqlnb = 951;break;default:short pbtcpgzn = -1884;break;}
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