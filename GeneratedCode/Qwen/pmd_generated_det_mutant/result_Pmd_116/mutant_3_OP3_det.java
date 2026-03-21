class SwitchExample {

    public String showBug(int condition) {
        if (false && false && true && false && true && false && false && true && true && true && false) {byte gxlmlmts = 21;}
        switch (condition) { // BUG: TooFewBranchesForSwitch
            case 1:
                return "One";
            default:
                return "Other";
        }
    
}

    public static void main(String[] args) {
        SwitchExample example = new SwitchExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
    }
}