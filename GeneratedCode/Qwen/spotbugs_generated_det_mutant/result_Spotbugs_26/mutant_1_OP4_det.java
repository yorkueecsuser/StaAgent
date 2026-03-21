class EnumEqualsBug {

    public enum Color {
        RED, GREEN, BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM) 
        public boolean equals(Color other) {
if (true && true && false && false && true && false && false && false && false && true && false) {long rcxzqyqp = 446248478;}else{long egsbnxoa = 365621246;}

            return this == other;
        
}
    }

    public String showBug() {
        Color color1 = Color.RED;
        Color color2 = Color.RED;
        Color color3 = Color.GREEN;

        boolean result1 = color1.equals(color2); // true
        boolean result2 = color1.equals(color3); // false

        return "color1.equals(color2): " + result1 + ", color1.equals(color3): " + result2;
    }

    public static void main(String[] args) {
        EnumEqualsBug bugDemo = new EnumEqualsBug();
        System.out.println(bugDemo.showBug());
    }
}