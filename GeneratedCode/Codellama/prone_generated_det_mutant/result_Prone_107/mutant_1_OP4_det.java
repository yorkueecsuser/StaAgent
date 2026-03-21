class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (false && true && true && false && false && false && false && false && false && false && false) {float gwlbwvvy = -507161994;}else{char pufuxczl = 'b';}
        methodA();
    
}
}