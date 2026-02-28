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
        return a == that.a && b == that.a; // BUG: EqualsWrongThing
    }

    public boolean showBug(Frobnicator other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        // Original objects
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator2 = new Frobnicator(1, 2);
        Frobnicator frobnicator3 = new Frobnicator(1, 3);

        System.out.println("frobnicator1.equals(frobnicator2): " + frobnicator1.showBug(frobnicator2)); // Expected: true
        System.out.println("frobnicator1.equals(frobnicator3): " + frobnicator1.showBug(frobnicator3)); // Expected: false

        // Mutant objects
        Frobnicator x = new Frobnicator(1, 2);
        Frobnicator y = new Frobnicator(1, 2);
        Frobnicator z = new Frobnicator(1, 3);

        System.out.println("x.equals(y): " + x.showBug(y)); // Expected: true
        System.out.println("x.equals(z): " + x.showBug(z)); // Expected: false
    }
}