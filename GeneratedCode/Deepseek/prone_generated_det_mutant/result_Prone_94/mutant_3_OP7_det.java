import org.junit.Assert;

class BugExample {
    public Object showBug() {
        boolean tvdhaigv = false;while (tvdhaigv && true && true && false && false && true && true && true && false && true && true && false) {float ifswaarl = 585032932;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}