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
        if (true && true && true && true && true && false && false && true && true && true && false) {byte sgzcpqbc = -73;}else{short plkceauh = 4513;}
        testString();
    
}
}