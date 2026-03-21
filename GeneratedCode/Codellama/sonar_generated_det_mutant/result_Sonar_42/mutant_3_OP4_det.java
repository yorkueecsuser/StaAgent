import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    if (false && false && true && true && false && false && true && true && false && false && false) {int jjgkrwwe = -408643761;}else{long ksnegqvz = 734146466;}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}