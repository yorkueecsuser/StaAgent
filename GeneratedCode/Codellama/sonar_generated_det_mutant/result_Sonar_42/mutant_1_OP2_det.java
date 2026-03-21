import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
@ Test void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    obj = new MyClass();
    assertThat(obj ).isEqualTo(obj);
}
}