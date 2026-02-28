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
        // Dead Store Mutation: Adding an unused int variable
        int deadStore = 5;
        return a == that.a && b == that.a; // BUG: EqualsWrongThing - should be b == that.b
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}