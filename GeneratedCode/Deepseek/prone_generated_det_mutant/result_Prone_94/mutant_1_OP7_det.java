import org.junit.Assert;

class BugExample {
    public Object showBug() {
        boolean ueviyyst = false;while (ueviyyst && true && false && false && false && false && true && true && true && false && false && false) {float vfylxhtr = -9299908;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}