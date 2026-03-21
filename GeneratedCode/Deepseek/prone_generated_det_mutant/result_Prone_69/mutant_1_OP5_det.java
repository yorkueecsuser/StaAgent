import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    this.field1 = field1;
  }

  public List<String> getField1() {
int ezkhsbbq = 0;switch  (ezkhsbbq) {case 1:double jnhjhaud = -921354036;break;default:long admyxsxq = 611156334;break;}

    return field1;
  
}
}