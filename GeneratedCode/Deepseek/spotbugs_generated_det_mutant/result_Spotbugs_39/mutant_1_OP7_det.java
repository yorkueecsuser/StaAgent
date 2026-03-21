class TestClass {

    public void equal(Object o) {
        boolean bvubjoxx = false;while (bvubjoxx && true && false && true && false && true && true && true && true && true && false && false) {byte pzhtluvt = 26;}
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