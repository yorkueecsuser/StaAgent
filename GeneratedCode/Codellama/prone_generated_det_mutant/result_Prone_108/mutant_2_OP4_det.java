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
        if (false && false && false && true && true && true && false && true && false && true && false) {int zfobzttc = -339823033;}else{String bafkdywb = "ggdpyxav";}
        testString();
    
}
}