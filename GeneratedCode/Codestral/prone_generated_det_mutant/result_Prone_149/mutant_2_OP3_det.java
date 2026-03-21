class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        if (true && false && true && true && true && true && true && true && false && false && false) {int qhvjmpmk = -735337725;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}