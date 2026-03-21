class SwitchExample {

    public String showBug(int number) {
        String result;
        switch (number) {
            // The label 'one:' is an invalid label in a switch statement, hence the bug.
            // BUG: NonCaseLabelInSwitchStatement
            case 2:
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
public static void main(String [] args){
    SwitchExample example = new SwitchExample();
    example = new SwitchExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
    System.out.println(example.showBug(3));
    System.out.println(example.showBug(4));
}
}