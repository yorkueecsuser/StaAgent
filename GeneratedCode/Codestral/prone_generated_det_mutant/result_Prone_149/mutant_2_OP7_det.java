class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        boolean tluxnikp = false;while (tluxnikp && true && false && false && false && false && true && false && false && false && false && false) {double zoexgtxu = -761735422;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}