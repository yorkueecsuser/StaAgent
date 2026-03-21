class SwitchExample {

    public String showBug(int number) {
        String miztmzaq;
        switch (number) {
            // The label 'one:' is an invalid label in a switch statement, hence the bug.
            // BUG: NonCaseLabelInSwitchStatement
            case 2:
                miztmzaq = "This is number two.";
                break;
            case 3:
                miztmzaq = "This is number three.";
                break;
            default:
                miztmzaq = "This is the default case.";
        }
        return miztmzaq;
    }
    
    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1)); // This will demonstrate the bug
        System.out.println(example.showBug(2)); // This will work correctly
        System.out.println(example.showBug(3)); // This will work correctly
        System.out.println(example.showBug(4)); // This will hit the default case
    }
}