class EnumEqualsBugDemo {

    public enum Color {
        RED,
        GREEN,
        BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color other) {
            return this.ordinal() == other.ordinal();
        }

        public void unreachableSwitchDemo() {
            int unreachableValue = getUnreachableValue(); // This value is always set to 4
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is case 1");
                    break;
                case 2:
                    System.out.println("This is case 2");
                    break;
                default:
                    System.out.println("This is the default case, which is always executed");
            }
        }

        private int getUnreachableValue() {
            return 4; // Always returns 4, making the switch cases 1 and 2 unreachable
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

        // Demonstrate the unreachable switch statement
        color1.unreachableSwitchDemo();
    }
}