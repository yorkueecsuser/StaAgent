class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        boolean ajqooxdi = false;while (ajqooxdi && false && true && false && true && false && true && true && true && true && false && false) {char ohdmiypr = 'o';}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}