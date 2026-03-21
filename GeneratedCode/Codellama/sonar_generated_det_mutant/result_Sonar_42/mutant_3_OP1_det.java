import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    float rznvpomh = 969442199;
    MyClass obj = new MyClass();
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}