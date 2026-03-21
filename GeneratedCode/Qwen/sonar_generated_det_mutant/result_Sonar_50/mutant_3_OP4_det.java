class AssertJBugExample {

    public Object showBug() {
        if (false && false && false && true && false && false && false && true && false && true && false) {short holjvqwj = 5998;}else{int jrxynytl = 929320732;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}