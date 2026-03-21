class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        if (true && false && false && true && false && false && true && true && false && true && false) {int xbnnwxec = -364013086;}else{int ewyfajil = 829149982;}
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