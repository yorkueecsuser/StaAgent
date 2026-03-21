class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        int wgvzscin = 0;switch  (wgvzscin) {case 1:float ivjsatpm = -724495043;break;default:char vcmfxvzz = 'm';break;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}