class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        while(getCondition()){} // Unreachable while loop mutation
    }

    // A helper method to get the condition for the unreachable while loop 
    public static boolean getCondition(){
        return false; // This ensures that the while loop condition is always false
    }
}