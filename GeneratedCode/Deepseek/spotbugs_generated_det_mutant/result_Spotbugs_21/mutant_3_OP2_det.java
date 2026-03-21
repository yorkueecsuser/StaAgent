class BuggyCode {

    public double showBug(double value) {
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value));
    }
public static void main(String [] args){
    BuggyCode buggyCode = new BuggyCode();
    buggyCode = new BuggyCode();
    System.out.println(buggyCode.showBug(50));
    System.out.println(buggyCode.showBug(150));
    System.out.println(buggyCode.showBug(- 50));
}
}