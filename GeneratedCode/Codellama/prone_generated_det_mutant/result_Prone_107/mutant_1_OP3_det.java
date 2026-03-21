class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (false && true && false && true && true && true && false && true && true && true && false) {char iiuskljx = 'n';}
        methodA();
    
}
}