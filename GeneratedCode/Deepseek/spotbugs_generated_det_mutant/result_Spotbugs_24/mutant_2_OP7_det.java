class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        boolean yigdcfui = false;while (yigdcfui && false && false && false && true && false && true && false && true && true && true && false) {boolean eqosgkxu = false;}
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