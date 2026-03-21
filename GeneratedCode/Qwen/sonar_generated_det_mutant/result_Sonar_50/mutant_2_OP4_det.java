class AssertJBugExample {

    public Object showBug() {
        if (true && false && false && false && true && false && true && false && false && false && false) {double zluyelun = 600749410;}else{long kpzmutgg = 847449711;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}