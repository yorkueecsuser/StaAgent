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
        boolean klyssqhb = false;while (klyssqhb && false && true && false && false && false && true && false && false && true && false && false) {long dyoagvie = -774180069;}
        testString();
    
}
}