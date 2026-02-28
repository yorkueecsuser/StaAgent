class EnumEqualsBugDemo {

    public enum Color {
        RED,
        GREEN,
        BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color other) {
            return this.ordinal() == other.ordinal();
        }
    }

    public static boolean showBug(Color color1, Color color2) {
        boolean condition = false; // A non-final variable to ensure the condition is not a constant
        if (condition) {
            // Unreachable branch
            System.out.println("This branch is never executed.");
        } else {
            // The original logic remains unaffected
            return color1.equals(color2);
        }
        // The return statement here is unreachable because the condition is always false
        return false; // To ensure the method compiles correctly
    }

    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        System.out.println("Are the colors equal according to the buggy equals method? " + showBug(color1, color2));
        System.out.println("Are the colors equal according to default enum comparison? " + (color1 == color2));
    }
}