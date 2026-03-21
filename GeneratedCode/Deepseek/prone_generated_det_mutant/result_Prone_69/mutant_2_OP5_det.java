import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    int vvnpseyx = 0;switch  (vvnpseyx) {case 1:short rokwdhxi = -8518;break;default:float oorucbuy = -773281949;break;}
    this.field1 = field1;
  
}

  public List<String> getField1() {
    return field1;
  }
}