class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
if (false && false && true && true && false && false && false && false && true && false && false) {double ramhfwsq = 312362788;}else{float tjcnetpw = 612443442;}

        return 2 ^ 2;
    
}

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}