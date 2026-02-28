class AlwaysTrueEquals {
    
    private String name;
    private int id;

    public AlwaysTrueEquals(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean showBug(AlwaysTrueEquals other) {
        // Demonstrates the bug by comparing two different objects
        return this.equals(other);
    }

    public static void main(String[] args) {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Object1", 1);
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Object2", 2);

        AlwaysTrueEquals test = new AlwaysTrueEquals("Test", 3);
        System.out.println("Are obj1 and obj2 equal? " + test.showBug(obj2));
    }
}

// Mutated Code
class AlwaysTrueEqualsMutant {
    
    private String x;
    private int y;

    public AlwaysTrueEqualsMutant(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    @Override
    public int hashCode() {
        return y;
    }

    public boolean showBug(AlwaysTrueEqualsMutant z) {
        // Demonstrates the bug by comparing two different objects
        return this.equals(z);
    }

    public static void main(String[] args) {
        AlwaysTrueEqualsMutant a = new AlwaysTrueEqualsMutant("Object1", 1);
        AlwaysTrueEqualsMutant b = new AlwaysTrueEqualsMutant("Object2", 2);

        AlwaysTrueEqualsMutant c = new AlwaysTrueEqualsMutant("Test", 3);
        System.out.println("Are a and b equal? " + c.showBug(b));
    }
}