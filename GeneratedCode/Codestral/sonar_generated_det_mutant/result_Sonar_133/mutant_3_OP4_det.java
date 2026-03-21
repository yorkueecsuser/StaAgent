class TernaryOperatorBug {

    public long showBug(boolean condition, int intValue, long longValue) {
if (false && true && false && false && false && true && true && true && true && true && false) {String dvgxtgvx = "izsdmglq";}else{int lgtpvwia = 381010164;}

        return condition? intValue : longValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    
}

    public static void main(String[] args) {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long result = bug.showBug(true, 10, 20L);
        System.out.println("Result: " + result);
    }
}