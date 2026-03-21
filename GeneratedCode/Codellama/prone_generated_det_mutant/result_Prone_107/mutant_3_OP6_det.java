class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        for  (int jjencvrn = 0; jjencvrn < 0; jjencvrn++) {long zhwvhwun = -919299284;}
        methodA();
    
}
}