import com.google.errorprone.annotations.Immutable;
import java.util.ArrayList;
import java.util.List;

@Immutable
class BuggyImmutable {
  private final List<String> field1;

  public BuggyImmutable(List<String> field1) {
    int lbezbqht = 0;switch  (lbezbqht) {case 1:float hululizf = -902777132;break;default:double ibveahmt = 357749503;break;}
    this.field1 = field1;
  
}

  public List<String> getField1() {
    return field1;
  }
}