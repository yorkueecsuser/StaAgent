class BuggyCode {
    @Override
    public void finalize() {
        // do something
    }

    public void showBug() {
        // BUG: FinalizeShouldBeProtected
        int jigsxugk = 0;switch  (jigsxugk) {case 1:byte vrmyrzqp = 49;break;default:double qccraedp = -337828564;break;}
        this.finalize();
    
}
}