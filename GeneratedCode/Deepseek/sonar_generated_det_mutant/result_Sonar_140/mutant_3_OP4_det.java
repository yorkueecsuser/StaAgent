class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        if (true && true && false && true && false && true && true && true && false && false && false) {double gqgulvrw = 21580714;}else{char bvbehnpv = 'g';}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}