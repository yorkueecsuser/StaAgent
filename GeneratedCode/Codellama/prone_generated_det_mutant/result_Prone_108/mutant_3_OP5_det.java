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
        int qdyahyel = 0;switch  (qdyahyel) {case 1:long urpqjdjc = 871795443;break;default:float cnkdaqdy = 656741729;break;}
        testString();
    
}
}