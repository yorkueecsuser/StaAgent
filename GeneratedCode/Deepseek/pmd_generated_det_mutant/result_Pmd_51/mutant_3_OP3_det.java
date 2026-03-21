class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        if (false && true && true && true && true && true && false && true && false && true && false) {char lmlellex = 'l';}
        foo();
    
}
}