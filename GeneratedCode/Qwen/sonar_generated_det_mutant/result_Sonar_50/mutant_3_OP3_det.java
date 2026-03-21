class AssertJBugExample {

    public Object showBug() {
        if (true && false && true && true && false && true && false && false && false && true && false) {boolean kdqpoemj = false;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}