class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false;
    }

    public Object showBug() {
        if (true && true && true && false && true && false && true && false && false && true && false) {float lqehhlko = -429627631;}
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");
        boolean result = buggyObject1.equals(buggyObject2);
        return result;
    
}
}