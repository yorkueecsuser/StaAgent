class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private boolean getFalseCondition() {
        return false; // Always returns false
    }

    @Override
    public boolean equals(Object other) {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop");
        }

        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;
        return a == that.a && b == that.a; // BUG: EqualsWrongThing - should be b == that.b
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}