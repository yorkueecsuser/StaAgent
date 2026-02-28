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

    // Start of mutated code
    private int x; // This line introduces a renamed variable 'x' derived from 'a'
    private int y; // This line introduces a renamed variable 'y' derived from 'b'

    public Frobnicator(char x, char y) { // Overloaded constructor with renamed parameters
        this.x = x;
        this.y = y;
    }

    public boolean equalsRenamed(Object other) {
        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;
        return x == that.x && y == that.y; // Using renamed variables
    }

    public boolean showBugRenamed(Frobnicator other) {
        return this.equalsRenamed(other);
    }
    // End of mutated code

    public static void main(String[] args) {
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator2 = new Frobnicator(1, 2);
        Frobnicator frobnicator3 = new Frobnicator(1, 3);

        System.out.println("frobnicator1.equals(frobnicator2): " + frobnicator1.showBug(frobnicator2)); // Expected: true
        System.out.println("frobnicator1.equals(frobnicator3): " + frobnicator1.showBug(frobnicator3)); // Expected: false

        // Start of mutated code
        Frobnicator frobnicator4 = new Frobnicator('a', 'b');
        Frobnicator frobnicator5 = new Frobnicator('a', 'b');
        Frobnicator frobnicator6 = new Frobnicator('a', 'c');

        System.out.println("frobnicator4.equalsRenamed(frobnicator5): " + frobnicator4.showBugRenamed(frobnicator5)); // Expected: true
        System.out.println("frobnicator4.equalsRenamed(frobnicator6): " + frobnicator4.showBugRenamed(frobnicator6)); // Expected: false
        // End of mutated code
    }
}