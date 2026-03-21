class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        for  (int pbcqqpal = 0; pbcqqpal < 0; pbcqqpal++) {byte nypsrzhe = -108;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}