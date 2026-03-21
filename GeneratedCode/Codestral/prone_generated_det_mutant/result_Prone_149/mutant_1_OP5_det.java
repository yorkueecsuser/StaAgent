class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        int hxujnjsw = 0;switch  (hxujnjsw) {case 1:long succpbcr = 691545351;break;default:byte ccaxhleg = -111;break;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}