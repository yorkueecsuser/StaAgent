class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        int nnbdslsq = 0;switch  (nnbdslsq) {case 1:char aykahwbi = 'k';break;default:long aozyxrjj = -117667821;break;}
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