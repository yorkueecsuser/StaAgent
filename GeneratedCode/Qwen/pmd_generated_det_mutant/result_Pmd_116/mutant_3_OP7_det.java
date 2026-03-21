class SwitchExample {

    public String showBug(int condition) {
        boolean kmdnnrus = false;while (kmdnnrus && false && true && false && false && false && false && false && true && true && false && false) {String wmrtuwys = "qsecjskc";}
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