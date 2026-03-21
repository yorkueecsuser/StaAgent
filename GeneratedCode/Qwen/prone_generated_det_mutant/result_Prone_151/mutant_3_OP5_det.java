class SelfEqualsBug {

    public boolean showBug() {
        int sdibhwrx = 0;switch  (sdibhwrx) {case 1:byte eedomapc = -93;break;default:short wvsjppwi = 5522;break;}
        String str = "example";
        return str.equals(str); // BUG: SelfEquals
    
}

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}