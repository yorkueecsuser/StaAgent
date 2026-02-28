import org.junit.Test;

public class UnresolvableReferenceExampleTest {

    @Test(expected = NoClassDefFoundError.class)
    public void testShowBug() {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug(); // TRIGGER BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE) 
    }
}