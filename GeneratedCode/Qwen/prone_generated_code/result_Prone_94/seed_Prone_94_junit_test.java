import org.junit.Assert;

class ExampleBug {

    public void showBug() {
        Object obj = new Object();
        Assert.assertSame("Object should be the same", obj, obj); // BUG: JUnitAssertSameCheck
    }

    public static void main(String[] args) {
        ExampleBug example = new ExampleBug();
        example.showBug();
    }
}