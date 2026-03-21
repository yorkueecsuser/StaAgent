class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        if (false && true && false && false && false && false && true && true && true && true && false) {double mbcgtxik = 333128413;}else{float qhmebexn = 624226066;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}