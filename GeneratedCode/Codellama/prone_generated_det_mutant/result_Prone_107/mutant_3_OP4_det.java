class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (true && true && false && false && false && false && true && true && true && true && false) {float cfpqggyw = 542737128;}else{int loceszns = -260602674;}
        methodA();
    
}
}