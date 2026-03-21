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
        for  (int ottvpqsl = 0; ottvpqsl < 0; ottvpqsl++) {String bvfupdke = "lsobeirl";}
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");
        boolean result = buggyObject1.equals(buggyObject2);
        return result;
    
}
}