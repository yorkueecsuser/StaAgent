class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        for  (int qaaixgdv = 0; qaaixgdv < 0; qaaixgdv++) {boolean ckehmzdz = false;}
        methodA();
    
}
}