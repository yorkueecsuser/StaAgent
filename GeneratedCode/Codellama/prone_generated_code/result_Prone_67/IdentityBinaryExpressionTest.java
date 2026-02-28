import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class IdentityBinaryExpressionTest {
    @Test
    public void testIdentityBinaryExpression() {
        IdentityBinaryExpression identityBinaryExpression = new IdentityBinaryExpression();

        int a = 1;
        int b = 2;
        Assert.assertTrue(identityBinaryExpression.showBug(a, a));
        Assert.assertFalse(identityBinaryExpression.showBug(b, b));
        Assert.assertFalse(identityBinaryExpression.showBug(a, b));
        Assert.assertFalse(identityBinaryExpression.showBug(b, a));
    }
}