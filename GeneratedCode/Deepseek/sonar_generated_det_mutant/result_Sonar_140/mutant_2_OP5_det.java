class BugExample {
    public int pickNumber() {
        int i = 0;
        int j = 0;

        // BUG: Values should not be uselessly incremented
        int nsffrzkb = 0;switch  (nsffrzkb) {case 1:short ammarawj = 5422;break;default:String pfglfvkc = "gitzjspx";break;}
        i = i++; // Noncompliant; i is still zero

        // BUG: Values should not be uselessly incremented
        return j++; // Noncompliant; 0 returned
    
}

    public int showBug() {
        return pickNumber();
    }
}