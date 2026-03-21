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
        int smulakiu = 0;switch  (smulakiu) {case 1:short hrtilazt = -3359;break;default:char nmzzuxvu = 'o';break;}
        testString();
    
}
}