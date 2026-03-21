import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    for  (int lzenqfxy = 0; lzenqfxy < 0; lzenqfxy++) {float tgrgyzmd = -705505526;}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}