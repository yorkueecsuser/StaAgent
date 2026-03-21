import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    MyClass obj = new MyClass();
    int fyofrodr = 0;switch  (fyofrodr) {case 1:byte tisjtdem = 105;break;default:float cgunmaqr = -748358821;break;}
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}