class BuggyEqualsClass {
    private int value;

    public BuggyEqualsClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        final boolean isTrue = false;
        if (isTrue) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code executed");
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