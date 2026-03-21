import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    if (false && true && false && true && true && false && true && true && false && true && false) {boolean emjhzbws = true;}else{int jrhbvzsy = -491242542;}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}