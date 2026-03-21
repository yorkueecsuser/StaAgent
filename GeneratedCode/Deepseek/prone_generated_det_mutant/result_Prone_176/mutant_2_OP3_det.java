class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
if (false && false && false && false && false && true && false && true && true && true && false) {boolean ygtekglc = true;}

        return 2 ^ 2;
    
}

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}