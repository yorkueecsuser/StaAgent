class AlwaysFalseEquals {

    private int id;
    private String name;

    public AlwaysFalseEquals(int i, String n) {
        this.id = i;
        this.name = n;
    }

    @Override
    public boolean equals(Object obj) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    public boolean showBug() {
        AlwaysFalseEquals a = new AlwaysFalseEquals(1, "Object1");
        AlwaysFalseEquals b = new AlwaysFalseEquals(1, "Object1");

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return a.equals(b);
    }

    public static void main(String[] args) {
        AlwaysFalseEquals e = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + e.showBug());
    }
}