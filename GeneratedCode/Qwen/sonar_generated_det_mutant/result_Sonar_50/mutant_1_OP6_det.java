class AssertJBugExample {

    public Object showBug() {
        for  (int regubiyq = 0; regubiyq < 0; regubiyq++) {short tdytmijk = 515;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}