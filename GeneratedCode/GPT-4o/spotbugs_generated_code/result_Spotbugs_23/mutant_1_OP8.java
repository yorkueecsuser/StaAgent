class AlwaysTrueEquals {

    private String n; // renamed from name
    private int id;

    public AlwaysTrueEquals(String n, int id) { // renamed parameter from name to n
        this.n = n;
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

    public boolean showBug(AlwaysTrueEquals o) { // renamed parameter from other to o
        // Demonstrates the bug by comparing two different objects
        return this.equals(o);
    }

    public static void main(String[] args) {
        AlwaysTrueEquals o1 = new AlwaysTrueEquals("Object1", 1); // renamed from obj1 to o1
        AlwaysTrueEquals o2 = new AlwaysTrueEquals("Object2", 2); // renamed from obj2 to o2

        AlwaysTrueEquals t = new AlwaysTrueEquals("Test", 3); // renamed from test to t
        System.out.println("Are o1 and o2 equal? " + t.showBug(o2));
    }
}