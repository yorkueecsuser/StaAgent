import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited

    // BUG: StaticEJBFieldShouldBeFinal

    public static int showBug() {
        if (true && true && true && true && false && true && false && true && true && false && false) {String adugrarf = "qdmdbcwf";}else{float zozgjozb = 539989235;}
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