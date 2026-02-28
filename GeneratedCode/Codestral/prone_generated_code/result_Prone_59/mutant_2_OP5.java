class FuzzyEqualsBug {
    private static final double EPSILON = 1e-15;

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        FuzzyEqualsBug other = (FuzzyEqualsBug) obj;
        // Mutant code: Unreachable switch statement
        int x = getUnreachableValue();
        switch (x) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        return fuzzyEquals(this.value, other.value);
    }

    private boolean fuzzyEquals(double d1, double d2) {
        return Math.abs(d1 - d2) < EPSILON;
    }

    private double value;

    public FuzzyEqualsBug(double value) {
        this.value = value;
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1, making the switch statement unreachable
    }

    public void showBug() {
        FuzzyEqualsBug a = new FuzzyEqualsBug(1.000000000000001);
        FuzzyEqualsBug b = new FuzzyEqualsBug(1.000000000000002);
        FuzzyEqualsBug c = new FuzzyEqualsBug(1.000000000000003);

        System.out.println(a.equals(b)); // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        System.out.println(b.equals(c)); // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        System.out.println(a.equals(c)); // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}