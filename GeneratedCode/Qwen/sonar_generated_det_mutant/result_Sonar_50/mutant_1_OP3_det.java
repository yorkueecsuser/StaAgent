class AssertJBugExample {

    public Object showBug() {
        if (true && false && false && false && false && true && true && false && true && false && false) {double tygoyeeg = -58834291;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}