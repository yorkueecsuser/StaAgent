class MissingSuperCallBug {
    @SuppressWarnings("MissingSuperCall")
    public void methodA() {
        // BUG: MissingSuperCall
        System.out.println("methodA called");
    }

    public void showBug() {
        for  (int jlhmhxmi = 0; jlhmhxmi < 0; jlhmhxmi++) {int sfqpobja = -810700362;}
        methodA();
    
}
}