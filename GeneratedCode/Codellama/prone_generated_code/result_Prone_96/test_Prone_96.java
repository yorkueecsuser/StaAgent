import org.junit.Test;

public class ConcreteClassTest {
    @Test
    public void testAbstractMethod() {
        ConcreteClass concreteClass = new ConcreteClass();
        // TRIGGER BUG: JavaxInjectOnAbstractMethod
        concreteClass.abstractMethod();
        // This line should fail, as the abstractMethod() is not injectable because it is an abstract method
    }
}