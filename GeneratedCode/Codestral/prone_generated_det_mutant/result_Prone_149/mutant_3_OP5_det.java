class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        int jhankccb = 0;switch  (jhankccb) {case 1:short gpliggau = 4360;break;default:String weefhdvi = "uaudhtqw";break;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}