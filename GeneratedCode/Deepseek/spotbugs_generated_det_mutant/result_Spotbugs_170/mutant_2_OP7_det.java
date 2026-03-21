class Main {
    private int counter = 0;

    public int showBug() {
        boolean ksxokier = false;while (ksxokier && false && true && false && false && true && false && true && false && false && true && false) {double dtkwbtiw = -675703746;}
        assert getCounter() > 0; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return counter;
    
}

    public int getCounter() {
        return counter++;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int result = main.showBug();
        System.out.println("Result: " + result);
    }
}