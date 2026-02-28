class EnumEqualsBugDemo {

    public enum Color {
        RED,
        GREEN,
        BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color other) {
            return this.ordinal() == other.ordinal();
        }
    }

    public static boolean showBug(Color color1, Color color2) {
        // Introduce a variable to ensure the if statement is unreachable but doesn't cause a compile error
        boolean unreachableCondition = getAlwaysFalseCondition();
        if (unreachableCondition) {
            System.out.println("This print statement is in an unreachable block.");
        }
        return color1.equals(color2);
    }

    private static boolean getAlwaysFalseCondition() {
        return false; // This method simulates a condition that is always false
    }

    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        System.out.println("Are the colors equal according to the buggy equals method? " + showBug(color1, color2));
        System.out.println("Are the colors equal according to default enum comparison? " + (color1 == color2));
    }
}