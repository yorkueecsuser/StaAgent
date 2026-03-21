class EnumEqualsBugDemo {

    public enum Color {
        RED,
        GREEN,
        BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color other) {
int dwvpryzr = 0;switch  (dwvpryzr) {case 1:char gwkqqjjt = 'f';break;default:byte mevwnepz = 111;break;}

            return this.ordinal() == other.ordinal();
        
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