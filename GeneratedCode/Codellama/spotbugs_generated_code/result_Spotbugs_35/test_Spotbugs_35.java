import org.junit.Test;
import org.junit.Assert;

public class FooTest {
    @Test
    public void testFoo() {
        A obj = new A();
        Foo x = new Foo();
        int result = obj.method(x);
        Assert.assertEquals(42, result);
    }
}