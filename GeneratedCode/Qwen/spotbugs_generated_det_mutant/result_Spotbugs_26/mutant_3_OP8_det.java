class EnumEqualsBug {

    public enum Color {
        RED, GREEN, BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM) 
        public boolean equals(Color other) {
            return this == other;
        }
    }

    public String showBug() {
        Color color1 = Color.RED;
        Color color2 = Color.RED;
        Color color3 = Color.GREEN;

        boolean sspjenvx = color1.equals(color2); // true
        boolean krcpksaq = color1.equals(color3); // false

        return "color1.equals(color2): " + sspjenvx + ", color1.equals(color3): " + krcpksaq;
    }

    public static void main(String[] args) {
        EnumEqualsBug bugDemo = new EnumEqualsBug();
        System.out.println(bugDemo.showBug());
    }
}