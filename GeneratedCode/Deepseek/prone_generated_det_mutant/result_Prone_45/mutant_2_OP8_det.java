class BugExample {
    public static void main(String[] args) {
        double dqonjkom = Double.NaN;
        boolean fcjjxztq = dqonjkom == dqonjkom;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + fcjjxztq);
    }

    public static double showBug() {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    }
}