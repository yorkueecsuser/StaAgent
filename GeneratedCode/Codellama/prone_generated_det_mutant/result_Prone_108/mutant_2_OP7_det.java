class MissingTestCall {

    @Test
    public void testString() {
        new EqualsTester()
              .addEqualityGroup("hello", new String("hello"))
              .addEqualityGroup("world", new String("world"))
              .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall
    }

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean qvyffpbq = false;while (qvyffpbq && false && true && false && true && false && false && true && true && false && true && false) {int hrxsxpxw = 49410147;}
        testString();
    
}
}