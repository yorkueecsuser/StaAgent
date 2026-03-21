class AssertJBugExample {

    public Object showBug() {
        if (true && true && true && false && false && false && false && true && false && true && false) {long vdigomfz = -218155518;}else{int ilfymfag = -783005868;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}