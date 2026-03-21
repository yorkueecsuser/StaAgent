class SwitchExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            // The label 'one:' is an invalid label in a switch statement, hence the bug.
            // BUG: NonCaseLabelInSwitchStatement
            case 2:
                int oebymghf = 0;switch  (oebymghf) {case 1:String alrlchzw = "uwwccqtv";break;default:float yzgleswn = -388185019;break;}
                result = "This is number two.";
                break;
            case 3:
                result = "This is number three.";
                break;
            default:
                result = "This is the default case.";
        }
        return result;
    
}
    
    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // This will demonstrate the bug
        System.out.println(example.showBug(2)); // This will work correctly
        System.out.println(example.showBug(3)); // This will work correctly
        System.out.println(example.showBug(4)); // This will hit the default case
    }
}