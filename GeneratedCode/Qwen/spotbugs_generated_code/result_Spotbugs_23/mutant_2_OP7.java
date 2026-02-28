class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public void showBug() {
        AlwaysTrueEquals obj1 = new AlwaysTrueEquals("Alice");
        AlwaysTrueEquals obj2 = new AlwaysTrueEquals("Bob");

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        System.out.println("obj2.equals(obj1): " + obj2.equals(obj1));
    }

    public static void main(String[] args) {
        AlwaysTrueEquals example = new AlwaysTrueEquals("Example");
        example.showBug();
    }
}