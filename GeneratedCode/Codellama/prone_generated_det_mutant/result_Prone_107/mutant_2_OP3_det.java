class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (false && false && true && false && true && false && true && false && true && false && false) {double oclqwqcu = -45326392;}
        methodA();
    
}
}