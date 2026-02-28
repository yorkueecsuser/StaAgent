class FuzzyEqualsBug {
    private static final double EPSILON = 1e-15;

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        FuzzyEqualsBug other = (FuzzyEqualsBug) obj;
        return fuzzyEquals(this.v, other.v);  // Renamed "value" to "v"
    }

    private boolean fuzzyEquals(double d1, double d2) {
        return Math.abs(d1 - d2) < EPSILON;
    }

    private double v;  // Renamed "value" to "v"

    public FuzzyEqualsBug(double v) {  // Renamed "value" to "v"
        this.v = v;  // Renamed "value" to "v"
    }

    public void showBug() {
        FuzzyEqualsBug a = new FuzzyEqualsBug(1.000000000000001);
        FuzzyEqualsBug b = new FuzzyEqualsBug(1.000000000000002);
        FuzzyEqualsBug c = new FuzzyEqualsBug(1.000000000000003);

        System.out.println(a.equals(b));  // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        System.out.println(b.equals(c));  // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        System.out.println(a.equals(c));  // Bug: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }
}