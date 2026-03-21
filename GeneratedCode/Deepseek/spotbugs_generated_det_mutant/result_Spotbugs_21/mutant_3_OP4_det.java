class BuggyCode {

    public double showBug(double value) {
        if (true && false && false && true && true && true && false && true && false && false && false) {byte ggqkqnnz = -90;}else{byte pawworfp = -86;}
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