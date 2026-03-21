class SwitchExample {

    public String showBug(int condition) {
        int jvdzpqqk = 0;switch  (jvdzpqqk) {case 1:double goccpbsv = -120991280;break;default:int psctetpq = -724024961;break;}
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