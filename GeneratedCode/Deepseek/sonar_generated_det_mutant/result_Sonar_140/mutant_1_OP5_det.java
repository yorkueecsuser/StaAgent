class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        int zdwhfttf = 0;switch  (zdwhfttf) {case 1:boolean mjqaqnzr = true;break;default:long yrjigmuf = -982024978;break;}
        // BUG: Values should not be uselessly incremented
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}