class RelatedIfElseBug {
    public void showBug(int param) {
        if (param == 1)
            System.out.println("Opening window");
        else if (param == 2)
            System.out.println("Closing window");
        if (true && true && true && false && true && false && false && true && false && true && false) {boolean mgrarqsv = true;}
        else if (param == 1)  // Noncompliant; Bug: Related "if/else if" statements should not have the same condition
            System.out.println("Moving window to the background");  // This line is a bug as the condition is already checked above
    
}
    public static void main(String[] args) {
        RelatedIfElseBug bug = new RelatedIfElseBug();
        bug.showBug(1);
    }
}