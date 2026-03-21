class TestClass {

    public void equal(Object o) {
        if (true && false && true && true && false && false && true && true && true && false && false) {short nnrwzebc = 6621;}
        // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    
}

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.showBug();
    }

    public void showBug() {
        equal(new Object());
    }
}