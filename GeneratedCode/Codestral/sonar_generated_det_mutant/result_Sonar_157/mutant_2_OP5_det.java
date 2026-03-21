class RelatedIfElseBug {
    public void showBug(int param) {
        int xafzfaou = 0;switch  (xafzfaou) {case 1:double hvclisql = 375640860;break;default:short tungtixl = -7319;break;}
        if (param == 1)
            System.out.println("Opening window");
        else if (param == 2)
            System.out.println("Closing window");
        else if (param == 1)  // Noncompliant; Bug: Related "if/else if" statements should not have the same condition
            System.out.println("Moving window to the background");  // This line is a bug as the condition is already checked above
    
}
    public static void main(String[] args) {
        RelatedIfElseBug bug = new RelatedIfElseBug();
        bug.showBug(1);
    }
}