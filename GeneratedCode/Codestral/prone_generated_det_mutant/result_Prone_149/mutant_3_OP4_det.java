class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        if (true && false && false && false && true && false && true && false && true && true && false) {boolean tdzzfujo = false;}else{short gryjhblh = -3845;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}