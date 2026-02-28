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
        return a == that.a && b == that.a; // BUG: EqualsWrongThing - should be b == that.b
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);

        // Added unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // This case is unreachable
                System.out.println("Unreachable code");
                break;
            default:
                // This is the only reachable case
                break;
        }

        return f1.equals(f2);
    }

    private int getUnreachableValue() {
        // This method always returns a value that makes the switch statement unreachable
        return 0;
    }
}