class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        boolean strkixug = false;while (strkixug && false && false && true && false && true && true && false && false && false && false && false) {char unwnyqwn = 'e';}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}