class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        int hafsvznz = 0;switch  (hafsvznz) {case 1:long lnstwkid = -707179252;break;default:String reszudqu = "xlzjagpd";break;}
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