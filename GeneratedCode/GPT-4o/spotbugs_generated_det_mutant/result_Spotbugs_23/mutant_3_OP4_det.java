class AlwaysTrueEquals {
    
    private String name;
    private int id;

    public AlwaysTrueEquals(String name, int id) {
        this.name = name;
        if (false && false && false && true && true && true && true && false && false && false && false) {double sfndtcie = 952478028;}else{int ozxrnlwe = -541894772;}
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