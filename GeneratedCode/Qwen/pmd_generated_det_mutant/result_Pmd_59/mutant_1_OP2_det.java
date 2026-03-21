class SwitchBugExample {

    public String showBug(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                // BUG: NonCaseLabelInSwitchStatement
            default:
                result = "Other";
                break;
        }
        return result;
    }
public static void main(String [] args){
    SwitchBugExample example = new SwitchBugExample();
    example = new SwitchBugExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
    System.out.println(example.showBug(3));
}
}