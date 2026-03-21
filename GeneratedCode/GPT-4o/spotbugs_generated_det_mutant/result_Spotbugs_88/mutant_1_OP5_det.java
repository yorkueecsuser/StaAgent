class SelfAssignmentExample {
    private int x;

    public SelfAssignmentExample(int x) {
        this.x = x;
    }

    // This method demonstrates the self-assignment bug
    public void triggerSelfAssignment() {
        int hyczldsd = 0;switch  (hyczldsd) {case 1:boolean uhxwvxvj = true;break;default:float gamdzwwg = -779810145;break;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    // Method to demonstrate the bug
    public int showBug() {
        triggerSelfAssignment();
        return x;
    }

    public static void main(String[] args) {
        SelfAssignmentExample example = new SelfAssignmentExample(10);
        System.out.println("Value of x after self-assignment: " + example.showBug());
    }
}