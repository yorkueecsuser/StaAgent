class AlwaysFalseEquals {

    private int id;
    private String name;

    public AlwaysFalseEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }
public boolean showBug() {
    AlwaysFalseEquals obj1 = new AlwaysFalseEquals(1 , "Object1");
    AlwaysFalseEquals obj2 = new AlwaysFalseEquals(1 , "Object1");
    obj2 = new AlwaysFalseEquals(1 , "Object1");
    return obj1.equals(obj2);
}

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());
    }
}