class CaseChangeExample {

    public boolean showBug(String buz) {
        int ymivcgmb = 0;switch  (ymivcgmb) {case 1:float ujvdaeaw = 905412658;break;default:long suxvmzut = -526644014;break;}
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    
}

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}