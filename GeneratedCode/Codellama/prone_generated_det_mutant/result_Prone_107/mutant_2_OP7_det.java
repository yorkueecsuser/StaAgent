class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        boolean wmqrzeuc = false;while (wmqrzeuc && true && true && false && true && false && true && true && true && true && false && false) {double bakvddnz = -611358576;}
        methodA();
    
}
}