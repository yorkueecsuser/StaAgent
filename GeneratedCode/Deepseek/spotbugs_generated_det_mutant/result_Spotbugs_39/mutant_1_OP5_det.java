class TestClass {

    public void equal(Object o) {
        int ddfrwdgu = 0;switch  (ddfrwdgu) {case 1:char pwiegxlc = 'b';break;default:boolean fkwessru = false;break;}
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