class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        if (false && false && false && true && true && false && true && true && true && false && false) {char qzlrrqoc = 'w';}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}