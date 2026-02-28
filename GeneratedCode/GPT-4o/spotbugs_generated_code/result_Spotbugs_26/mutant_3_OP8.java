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

    public static boolean showBug(Color x, Color y) {
        return x.equals(y);
    }

    public static void main(String[] args) {
        Color a = Color.RED;
        Color b = Color.GREEN;
        System.out.println("Are the colors equal according to the buggy equals method? " + showBug(a, b));
        System.out.println("Are the colors equal according to default enum comparison? " + (a == b));
    }
}