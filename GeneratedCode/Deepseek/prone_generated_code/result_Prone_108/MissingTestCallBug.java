import java.util.ArrayList;
import java.util.List;

class MissingTestCallBug {

    @Test
    public void string() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2)); // BUG: MissingTestCall
    }

    @Test
    public void string2() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2)); // BUG: MissingTestCall
    }

    public void showBug() {
        string();
        string2();
    }
}