class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;

        // Inserted unreachable if statement
        boolean unreachableCondition = isConditionFalse();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        }

        return a == that.a && b == that.a; // BUG: EqualsWrongThing - should be b == that.b
    }

    private boolean isConditionFalse() {
        return false;
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}