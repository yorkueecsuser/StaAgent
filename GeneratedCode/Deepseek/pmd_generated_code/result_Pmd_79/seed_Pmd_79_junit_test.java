import org.junit.Assert;

class SimpleTest {
    public void testX() {
        Assert.assertTrue(true);            // serves no real purpose - remove it
    }

    public void showBug() {
        return testX();
    }
}