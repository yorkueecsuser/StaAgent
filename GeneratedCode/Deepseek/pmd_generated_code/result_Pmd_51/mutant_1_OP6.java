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

// Unreachable for loop mutation
class JumbledIncrementerRule1Mutant1 {
    private boolean condition = false;

    public void foo() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                System.out.println("Hello");
            }
        }

        for(; condition; ) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public void showBug() {
        foo();
    }
}