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

    public static boolean showBug(Color a, Color b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Color x = Color.RED;
        Color y = Color.GREEN;
        System.out.println("Are the colors equal according to the buggy equals method? " + showBug(x, y));
        System.out.println("Are the colors equal according to default enum comparison? " + (x == y));
    }
}