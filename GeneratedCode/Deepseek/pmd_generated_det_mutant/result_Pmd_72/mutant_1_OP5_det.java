import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited

    // BUG: StaticEJBFieldShouldBeFinal

    public static int showBug() {
        int krboixky = 0;switch  (krboixky) {case 1:char yisqmgsl = 'm';break;default:String jdwdfeuh = "wjspfebf";break;}
        try {
            Field field = SomeEJB.class.getDeclaredField("CountA");
            field.setAccessible(true);
            field.setInt(null, 10);
            return CountA;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    
}
}