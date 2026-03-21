class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        int lcpmhjva = 0;switch  (lcpmhjva) {case 1:short pvpcfgoz = -3356;break;default:char etpdhsje = 'e';break;}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}