import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {

    @Test
    public void testDoSomething() {
        MyClass myClass = new MyClass();
        myClass.doSomething();
        // TRIGGER BUG: Locks should be released on all paths
        Assert.fail("Lock was not released on all paths");
    }
}