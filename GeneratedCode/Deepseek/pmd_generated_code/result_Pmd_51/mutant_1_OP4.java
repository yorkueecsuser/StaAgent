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

    public boolean getCondition() {
        return false;
    }
    
    public void addMutation() {
        if (getCondition()) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }
    }
}