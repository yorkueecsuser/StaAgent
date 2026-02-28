class Frobnicator {
    private int a;
    private int b;

    public Frobnicator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object other) {
        // Introduce unreachable if-else branch
        boolean dynamicCondition = getDynamicCondition(); // Dynamic condition method
        if (dynamicCondition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This branch is always executed");
        }

        if (!(other instanceof Frobnicator)) {
            return false;
        }
        Frobnicator that = (Frobnicator) other;
        return a == that.a && b == that.a; // BUG: EqualsWrongThing
    }

    public boolean showBug(Frobnicator other) {
        return this.equals(other);
    }

    // Method to simulate dynamic condition
    private boolean getDynamicCondition() {
        return false; // Always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        Frobnicator frobnicator1 = new Frobnicator(1, 2);
        Frobnicator frobnicator2 = new Frobnicator(1, 2);
        Frobnicator frobnicator3 = new Frobnicator(1, 3);

        System.out.println("frobnicator1.equals(frobnicator2): " + frobnicator1.showBug(frobnicator2)); // Expected: true
        System.out.println("frobnicator1.equals(frobnicator3): " + frobnicator1.showBug(frobnicator3)); // Expected: false
    }
}