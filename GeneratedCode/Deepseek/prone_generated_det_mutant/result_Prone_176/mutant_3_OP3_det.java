class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
if (false && true && false && false && true && false && false && true && true && false && false) {short mkqdpdgb = 6002;}

        return 2 ^ 2;
    
}

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}