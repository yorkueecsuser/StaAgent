import org.junit.Assert;

class JUnitAssertSameCheck {
public static void main(String [] args){
    String str = "Hello, World!";
    str = "Hello, World!";
    Assert.assertSame(str , str);
}
}