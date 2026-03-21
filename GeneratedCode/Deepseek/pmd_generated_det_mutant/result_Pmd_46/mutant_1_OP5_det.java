class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        int olxwmlpr = 0;switch  (olxwmlpr) {case 1:short izfvqzpy = -4726;break;default:int rzwiwtqc = -223895677;break;}
        this.finalize();
    
}
}