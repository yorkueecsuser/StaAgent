class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getFalseValue() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;

        // Inserted unreachable switch statement
        switch (getFalseValue()) {
            case 1:
                // Unreachable code
                break;
        }

        return a == that.a && b == that.a; // BUG: EqualsWrongThing - should be b == that.b
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}