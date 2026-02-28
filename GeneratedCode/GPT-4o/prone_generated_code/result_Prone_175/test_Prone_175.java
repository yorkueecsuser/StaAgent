import org.junit.Test;
import static org.junit.Assert.*;

public class OneofSwitchExampleTest {

    @Test
    public void testShowBugWithCaseFoo() {
        OneofSwitchExample.FooBar fooBarFoo = new OneofSwitchExample.FooBar(OneofSwitchExample.BlahCase.FOO, "FooValue", "BarValue");
        OneofSwitchExample example = new OneofSwitchExample();
        String result = example.showBug(fooBarFoo);
        assertEquals("FooValue", result);
    }

    @Test
    public void testShowBugWithCaseBar() {
        OneofSwitchExample.FooBar fooBarBar = new OneofSwitchExample.FooBar(OneofSwitchExample.BlahCase.BAR, "FooValue", "BarValue");
        OneofSwitchExample example = new OneofSwitchExample();
        String result = example.showBug(fooBarBar); // TRIGGER BUG: WrongOneof
        assertEquals("BarValue", result); // TRIGGER BUG: WrongOneof
    }
}