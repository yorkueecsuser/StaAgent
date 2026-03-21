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
        int mygjygsr = 0;switch  (mygjygsr) {case 1:byte svwlxwzd = -5;break;default:int jizoldva = -27469957;break;}
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");
        boolean result = buggyObject1.equals(buggyObject2);
        return result;
    
}
}