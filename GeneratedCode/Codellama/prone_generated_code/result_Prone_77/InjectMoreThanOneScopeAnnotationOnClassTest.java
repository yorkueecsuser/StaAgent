// TRIGGER BUG: InjectMoreThanOneScopeAnnotationOnClass

import org.junit.Test;
import static org.junit.Assert.*;

public class InjectMoreThanOneScopeAnnotationOnClassTest {
    @Test
    public void testBug() {
        InjectMoreThanOneScopeAnnotationOnClass obj = new InjectMoreThanOneScopeAnnotationOnClass();
        obj.showBug();
    }
}