class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        boolean bdopnphr = false;while (bdopnphr && false && true && true && false && true && false && false && true && true && false && false) {byte qnmqfnwz = 82;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}