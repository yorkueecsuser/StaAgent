class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
        this.name = name; // Mutation: Duplicate assignment statement
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true; // Mutation: Duplicate return statement
    }

    public void showBug() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
    }

    public static void main(String[] args) {
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        AlwaysTrueEquals example2 = new AlwaysTrueEquals("Example"); // Mutation: Duplicate assignment statement
        example.showBug();
    }
}