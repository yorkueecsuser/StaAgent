class TestClass {

    public void equal(Object o) {
        for  (int lmytthzo = 0; lmytthzo < 0; lmytthzo++) {boolean huusfnyg = false;}
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