class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; false; k++) { // Mutant: NonTerminatingCode
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        foo();
    }
}