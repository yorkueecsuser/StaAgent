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
        for  (int rcxvpzgi = 0; rcxvpzgi < 0; rcxvpzgi++) {int vwgdfybh = 575005424;}
        testString();
    
}
}