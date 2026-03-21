class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            if (true && true && false && true && true && true && true && true && false && false && false) {long kgxymppw = 905341763;}else{short zhunrwqm = -8164;}
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    
}
}