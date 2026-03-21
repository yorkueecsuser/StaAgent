import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    if (true && true && true && false && true && false && true && false && true && true && false) {int oshbwfvo = 660102549;}
    MyClass obj = new MyClass();
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}