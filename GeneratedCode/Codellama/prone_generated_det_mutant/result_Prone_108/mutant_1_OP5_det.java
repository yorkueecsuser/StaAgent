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
        int pimqfzee = 0;switch  (pimqfzee) {case 1:byte mxibhgdm = -68;break;default:long fbgpmxui = -427027200;break;}
        testString();
    
}
}