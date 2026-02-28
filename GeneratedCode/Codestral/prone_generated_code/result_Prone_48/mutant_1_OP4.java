class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        boolean shouldRun = false; // Added unreachable if-else branch
        if (shouldRun) {
            System.out.println("Unreachable code");
        } else {
            if (!(other instanceof Frobnicator)) {
                return false;
            }
            Frobnicator that = (Frobnicator) other;
            return a == that.a && b == that.a;
        }
    }

    public boolean showBug() {
        Frobnicator f1 = new Frobnicator(1, 2);
        Frobnicator f2 = new Frobnicator(1, 3);
        return f1.equals(f2);
    }
}