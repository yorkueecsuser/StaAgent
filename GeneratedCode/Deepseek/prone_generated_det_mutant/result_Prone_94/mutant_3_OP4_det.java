import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (false && false && false && true && true && true && false && true && true && true && false) {float zwnyserc = -934488221;}else{String lsmlpkiy = "qdfxqopf";}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}