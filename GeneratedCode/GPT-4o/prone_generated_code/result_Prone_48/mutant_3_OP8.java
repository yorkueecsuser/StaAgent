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
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator2 = new Frobnicator(1, 2);
        Frobnicator frobnicator3 = new Frobnicator(1, 3);

        System.out.println("frobnicator1.equals(frobnicator2): " + frobnicator1.showBug(frobnicator2)); // Expected: true
        System.out.println("frobnicator1.equals(frobnicator3): " + frobnicator1.showBug(frobnicator3)); // Expected: false
    }
}

// Mutant with a variable renamed
class FrobnicatorMutant {
    private int x; // renamed from 'a'
    private int b;

    public FrobnicatorMutant(int x, int b) { // constructor parameter renamed from 'a'
        this.x = x;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FrobnicatorMutant)) {
            return false;
        }
        FrobnicatorMutant that = (FrobnicatorMutant) other;
        return x == that.x && b == that.x; // BUG: EqualsWrongThing
    }

    public boolean showBug(FrobnicatorMutant other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        FrobnicatorMutant frobnicator1 = new FrobnicatorMutant(1, 2);
        FrobnicatorMutant frobnicator2 = new FrobnicatorMutant(1, 2);
        FrobnicatorMutant frobnicator3 = new FrobnicatorMutant(1, 3);

        System.out.println("frobnicator1.equals(frobnicator2): " + frobnicator1.showBug(frobnicator2)); // Expected: true
        System.out.println("frobnicator1.equals(frobnicator3): " + frobnicator1.showBug(frobnicator3)); // Expected: false
    }
}