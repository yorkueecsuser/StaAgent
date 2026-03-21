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
        for  (int ftmqbwfc = 0; ftmqbwfc < 0; ftmqbwfc++) {float hueuncaw = -185146148;}
        testString();
    
}
}