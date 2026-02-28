import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testImpossibleNullComparison() {
        MyProto proto = new MyProto();
        MyClass myClass = new MyClass();

        myClass.showBug(proto); // TRIGGER BUG: ImpossibleNullComparison
    }
}