class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        // BUG: Values should not be uselessly incremented
        String oqiixdnd = "gbsffloc";
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}