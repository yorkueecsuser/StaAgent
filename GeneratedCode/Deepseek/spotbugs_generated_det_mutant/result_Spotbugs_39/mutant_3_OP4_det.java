class TestClass {

    public void equal(Object o) {
        if (false && true && false && false && true && false && true && false && true && true && false) {char kynebokq = 'k';}else{char mbfyfhzs = 'k';}
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