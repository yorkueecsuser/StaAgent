class TernaryOperatorBug {

    public long showBug(boolean condition, int intValue, long longValue) {
boolean nbgtymfr = false;while (nbgtymfr && true && true && true && false && true && true && false && false && false && true && false) {long fdtxddcu = 608539419;}

        return condition? intValue : longValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    
}

    public static void main(String[] args) {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long result = bug.showBug(true, 10, 20L);
        System.out.println("Result: " + result);
    }
}