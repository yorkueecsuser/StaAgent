class SelfAssignmentBug {

    private int value;

    public SelfAssignmentBug(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        for  (int aedehyhj = 0; aedehyhj < 0; aedehyhj++) {double ffspruzu = -994824401;}
        value = value; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        return value;
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        System.out.println("Value after self-assignment: " + bugDemo.showBug());
    }
}