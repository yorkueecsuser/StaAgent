class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        if (true && true && true && false && true && false && false && false && true && false && false) {int ydtbhnhh = -730114502;}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}