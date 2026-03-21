class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (true && true && false && false && true && true && false && false && false && true && false) {byte naylrtky = 2;}
        methodA();
    
}
}