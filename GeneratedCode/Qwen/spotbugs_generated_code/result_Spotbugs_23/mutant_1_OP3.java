class AlwaysTrueEquals {

    private String name;

    public AlwaysTrueEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean condition = getCondition(); // Non-final variable to avoid unreachable if statement
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block.");
        }
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE) 
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
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