class IfElseIfBugExample {

    public String showBug(int param) {
        if (param == 1) {
            return "openWindow";
        } else if (param == 2) {
            return "closeWindow";
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            return "moveWindowToTheBackground";
        }
        return "defaultAction";
    }
public static void main(String [] args){
    IfElseIfBugExample example = new IfElseIfBugExample();
    example = new IfElseIfBugExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
    System.out.println(example.showBug(3));
}
}