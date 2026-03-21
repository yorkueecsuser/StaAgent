class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        boolean xfzryosf = false;while (xfzryosf && true && true && true && true && false && false && true && true && true && true && false) {double dtcyvgys = -707301836;}
        // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false;
    
}

    public Object showBug() {
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");
        boolean result = buggyObject1.equals(buggyObject2);
        return result;
    }
}