class Frobnicator {
    private int a;
    private int b;
    private int c; // Mutant: Renamed variable b to c

    public Frobnicator(int a, int b) {
        this.a = a;
        this.c = b; // Mutant: Using the renamed variable c here
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;
        return a == that.a && c == that.c; // Mutant: Changed b to c
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}