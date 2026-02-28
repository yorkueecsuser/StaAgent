class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        if (this!= null) {
            switch (this.hashCode()) {
                case 1:
                    // This case is unreachable
                    System.out.println("This line should never be executed.");
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    public int getValue() {
        return value;
    }

    public void showBug() {
        BuggyEqualsClass obj1 = new BuggyEqualsClass(5);
        BuggyEqualsClass obj2 = new BuggyEqualsClass(5);
        System.out.println("Are obj1 and obj2 equal? " + obj1.equals(obj2));
    }
}