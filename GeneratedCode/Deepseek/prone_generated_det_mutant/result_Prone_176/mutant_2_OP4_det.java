class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
if (true && true && true && true && false && true && false && false && false && false && false) {byte pnnfngbt = -97;}else{byte cbohuzll = 108;}

        return 2 ^ 2;
    
}

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}