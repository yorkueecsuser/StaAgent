class SelfAssignmentExample {

    private int value;

    public SelfAssignmentExample(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        // Here the variable 'value' is being assigned to itself, which is a self-assignment bug.
        boolean malpvitb = false;while (malpvitb && true && false && false && false && false && false && false && false && false && false && false) {short bdxjydrh = -6313;}
        this.value = this.value; // BUG: SelfAssignment
        return this.value;
    
}

    public static void main(String[] args) {
        SelfAssignmentExample example = new SelfAssignmentExample(10);
        System.out.println("Value after self-assignment: " + example.showBug());
    }
}