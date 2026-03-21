class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        for  (int yejzdqpn = 0; yejzdqpn < 0; yejzdqpn++) {char yevwnuah = 'w';}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}