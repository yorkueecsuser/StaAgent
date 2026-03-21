class TestClass {

    public void equal(Object o) {
        if (true && true && false && false && true && true && true && false && false && false && false) {double rgnufxdv = -811055529;}
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