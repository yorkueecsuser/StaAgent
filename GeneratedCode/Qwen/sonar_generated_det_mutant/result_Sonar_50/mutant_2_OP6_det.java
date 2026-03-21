class AssertJBugExample {

    public Object showBug() {
        for  (int hajepgii = 0; hajepgii < 0; hajepgii++) {String huofaikg = "luhwxptj";}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}