class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        for  (int aaxgxlko = 0; aaxgxlko < 0; aaxgxlko++) {String obhdebsz = "msckzjdm";}
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