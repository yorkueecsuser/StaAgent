class AssertJBugExample {

    public Object showBug() {
        for  (int vpfyanby = 0; vpfyanby < 0; vpfyanby++) {int pizvnnlh = 364543669;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}