class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        boolean pbrwyigg = false;while (pbrwyigg && true && false && false && false && false && true && false && false && true && false && false) {float xucupjqc = 326593545;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}