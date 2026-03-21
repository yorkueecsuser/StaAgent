class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
if (false && true && false && false && false && false && true && true && false && false && false) {byte tgclucva = 72;}else{String qhhazacl = "ivmrrkud";}

        return 2 ^ 2;
    
}

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}