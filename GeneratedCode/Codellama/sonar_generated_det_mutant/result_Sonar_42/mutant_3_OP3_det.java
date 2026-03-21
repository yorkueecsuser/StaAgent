import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    if (false && true && true && true && true && true && true && true && true && true && false) {char musbahqs = 'u';}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}