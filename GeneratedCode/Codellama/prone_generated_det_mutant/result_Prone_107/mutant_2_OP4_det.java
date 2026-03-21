class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        if (true && true && false && false && false && true && true && true && false && false && false) {char vkydokln = 'x';}else{boolean jaoqtuph = true;}
        methodA();
    
}
}