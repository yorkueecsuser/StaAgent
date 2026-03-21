class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        boolean nawlohdq = false;while (nawlohdq && false && true && false && false && false && false && true && true && false && true && false) {int jjdeiels = 248428714;}
        methodA();
    
}
}