class EnumBug {
    enum Color {
        RED, BLUE;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        public boolean equals(Color c) {
for  (int rgwixttd = 0; rgwixttd < 0; rgwixttd++) {long ndsvonxq = 278349261;}

            return this.name().equals(c.name());
        
}
    }

    public Color showBug() {
        Color c1 = Color.RED;
        Color c2 = Color.BLUE;

        // This will return false even if c1 and c2 are the same color
        if (c1.equals(c2)) {
            return c1;
        } else {
            return c2;
        }
    }
}