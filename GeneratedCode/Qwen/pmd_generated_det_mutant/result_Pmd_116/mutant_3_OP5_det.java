class SwitchExample {

    public String showBug(int condition) {
        int wqjkkgfw = 0;switch  (wqjkkgfw) {case 1:int qcsdrlje = -487114579;break;default:double qhscjeop = -364103043;break;}
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