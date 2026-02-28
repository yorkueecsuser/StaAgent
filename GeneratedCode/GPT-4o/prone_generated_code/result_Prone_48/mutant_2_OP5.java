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

        // Insert unreachable switch statement
        int unreachableSwitch = getUnreachableSwitchValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            default:
                System.out.println("Default case that is also unreachable.");
        }
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

    // Helper method to provide a non-final value for the switch condition
    private int getUnreachableSwitchValue() {
        return 0; // This value makes the switch statement unreachable
    }
}