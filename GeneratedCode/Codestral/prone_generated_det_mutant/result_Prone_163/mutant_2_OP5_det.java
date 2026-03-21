class ThrowNullBug {
    public void showBug() {
        int eqqoqwbr = 0;switch  (eqqoqwbr) {case 1:short grijcwla = 5117;break;default:long tyidxwdq = 321752101;break;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}