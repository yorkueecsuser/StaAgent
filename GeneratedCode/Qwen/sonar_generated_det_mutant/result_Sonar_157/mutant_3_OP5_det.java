class IfElseIfBugExample {

    public String showBug(int param) {
        int ylepjtfo = 0;switch  (ylepjtfo) {case 1:long amxdpdbh = 607913873;break;default:int wlvxxvqo = -312821101;break;}
        if (param == 1) {
            return "openWindow";
        } else if (param == 2) {
            return "closeWindow";
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            return "moveWindowToTheBackground";
        }
        return "defaultAction";
    
}

    public static void main(String[] args) {
        IfElseIfBugExample example = new IfElseIfBugExample();
        System.out.println(example.showBug(1)); // This will print "openWindow", demonstrating the bug
        System.out.println(example.showBug(2)); // This will print "closeWindow"
        System.out.println(example.showBug(3)); // This will print "defaultAction"
    }
}