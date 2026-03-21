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
        if (true && true && false && false && true && true && false && false && false && true && false) {boolean dfnrmttq = true;}else{String ehimjmvy = "evpqlawc";}
        testString();
    
}
}