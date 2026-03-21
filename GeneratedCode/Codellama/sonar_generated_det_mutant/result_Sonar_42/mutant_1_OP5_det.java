import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    int pfzyagkc = 0;switch  (pfzyagkc) {case 1:boolean lyvcwaiw = true;break;default:boolean dcjcpyoh = false;break;}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}