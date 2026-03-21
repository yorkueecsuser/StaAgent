import org.junit.Assert;

class BugExample {
    public Object showBug() {
        int othlhnrs = 0;switch  (othlhnrs) {case 1:int skuevcxz = 567996300;break;default:double tboythto = -226676038;break;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}