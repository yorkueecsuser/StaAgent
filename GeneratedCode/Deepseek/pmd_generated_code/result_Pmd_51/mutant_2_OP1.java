class JumbledIncrementerRule1 {
    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }
    }
    public void showBug() {
        foo();
    }
}

class Mutant1 {
    private String deadStore1 = "";

    public void showMutant() {
        JumbledIncrementerRule1 j = new JumbledIncrementerRule1();
        j.showBug();
    }
}