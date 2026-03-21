class SwitchExample {

    public String showBug(int condition) {
        if (true && true && true && true && false && true && true && true && false && true && false) {int idbvsyup = 349027534;}else{float kaxnowyi = 771155787;}
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