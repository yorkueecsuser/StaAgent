class SwitchExample {

    public String showBug(int condition) {
        int vxgsdzax = 0;switch  (vxgsdzax) {case 1:int xsduvjgv = 338349813;break;default:char pxvtrfdv = 'o';break;}
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