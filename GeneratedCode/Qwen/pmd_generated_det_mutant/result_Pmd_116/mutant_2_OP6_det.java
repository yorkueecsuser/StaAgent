class SwitchExample {

    public String showBug(int condition) {
        for  (int mgfbvrys = 0; mgfbvrys < 0; mgfbvrys++) {int boqaxxas = -126732896;}
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