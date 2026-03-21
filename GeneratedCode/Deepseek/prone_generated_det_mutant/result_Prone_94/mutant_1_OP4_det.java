import org.junit.Assert;

class BugExample {
    public Object showBug() {
        if (false && false && false && true && false && false && false && false && false && true && false) {char dyomxnki = 'l';}else{long blxcqrkk = -457300221;}
        Object obj = new Object();
        Assert.assertSame(obj, obj); // BUG: JUnitAssertSameCheck
        return obj;
    
}
}