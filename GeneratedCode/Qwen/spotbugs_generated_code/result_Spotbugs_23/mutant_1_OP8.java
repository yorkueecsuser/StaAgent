class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }

    public void showBug() {
        AlwaysTrueEquals x = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals y = new AlwaysTrueEquals("Bob");

        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("y.equals(x): " + y.equals(x));

        // Original variables retained for reference
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
    }

    public static void main(String[] args) {
        AlwaysTrueEquals z = new AlwaysTrueEquals("Example");
        z.showBug();

        // Original variable retained for reference
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        example.showBug();
    }
}