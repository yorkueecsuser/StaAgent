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
    }

    public static void main(String[] args) {
        AlwaysTrueEquals z = new AlwaysTrueEquals("Example");
        z.showBug();
    }
}