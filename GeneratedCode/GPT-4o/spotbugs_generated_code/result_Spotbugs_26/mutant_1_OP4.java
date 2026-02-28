class EnumEqualsBugDemo {

    public enum Color {
        RED,
        GREEN,
        BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color other) {
            // Unreachable if-else statement mutation
            boolean condition = getUnreachableCondition();
            if (condition) {
                return false; // This block is unreachable
            } else {
                return this.ordinal() == other.ordinal();
            }
        }

        private boolean getUnreachableCondition() {
            // Always returns false to ensure the if statement is unreachable
            return false;
        }
    }

    public static boolean showBug(Color color1, Color color2) {
        return color1.equals(color2);
    }

    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        System.out.println("Are the colors equal according to the buggy equals method? " + showBug(color1, color2));
        System.out.println("Are the colors equal according to default enum comparison? " + (color1 == color2));
    }
}