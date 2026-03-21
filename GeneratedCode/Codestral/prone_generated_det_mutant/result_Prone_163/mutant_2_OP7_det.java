class ThrowNullBug {
    public void showBug() {
        boolean hczpujps = false;while (hczpujps && false && false && false && true && false && false && false && false && true && true && false) {long dxofhshq = 344102967;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}