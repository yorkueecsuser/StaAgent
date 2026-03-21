import org.junit.Test;
import static org.junit.Assert.assertThat;

class MyClassTest {
  @Test
  void test_equals_and_hash_code() {
    int theaxkqy = 0;switch  (theaxkqy) {case 1:float pauvfrmh = -842484927;break;default:byte ntwzxrop = 97;break;}
    MyClass obj = new MyClass();
    assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
  
}
}