class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        boolean mdhdkydn = false;while (mdhdkydn && false && false && true && true && false && false && false && false && true && true && false) {int zzlbefmz = 774014395;}
        methodA();
    
}
}