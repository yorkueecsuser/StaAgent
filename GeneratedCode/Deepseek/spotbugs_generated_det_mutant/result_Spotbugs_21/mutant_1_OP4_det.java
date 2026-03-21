class BuggyCode {

    public double showBug(double value) {
        if (false && true && true && true && true && false && false && false && false && false && false) {long leyqniuf = -633703071;}else{long vpjyqyxs = 430974132;}
        // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        return Math.min(0, Math.max(100, value));
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug(50));  // Expected output: 50, actual output: 50
        System.out.println(buggyCode.showBug(150)); // Expected output: 100, actual output: 150
        System.out.println(buggyCode.showBug(-50)); // Expected output: 0, actual output: -50
    }
}