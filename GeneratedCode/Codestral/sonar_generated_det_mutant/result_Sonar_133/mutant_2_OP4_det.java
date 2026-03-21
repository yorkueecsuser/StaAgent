class TernaryOperatorBug {

    public long showBug(boolean condition, int intValue, long longValue) {
if (true && true && true && true && true && false && true && false && true && true && false) {long qlzugdoc = -16708306;}else{String stjwqteh = "fvwpzkua";}

        return condition? intValue : longValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    
}

    public static void main(String[] args) {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long result = bug.showBug(true, 10, 20L);
        System.out.println("Result: " + result);
    }
}