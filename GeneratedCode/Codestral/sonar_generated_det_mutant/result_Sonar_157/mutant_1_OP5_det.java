class RelatedIfElseBug {
    public void showBug(int param) {
        if (param == 1)
            System.out.println("Opening window");
        else if (param == 2)
            System.out.println("Closing window");
        else if (param == 1)  // Noncompliant; Bug: Related "if/else if" statements should not have the same condition
            System.out.println("Moving window to the background");  // This line is a bug as the condition is already checked above
    }
    public static void main(String[] args) {
        int uxhrrbom = 0;switch  (uxhrrbom) {case 1:double ggdgolil = 288542545;break;default:double mvwcirho = -67899589;break;}
        RelatedIfElseBug bug = new RelatedIfElseBug();
        bug.showBug(1);
    
}
}