import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;
import javax.ejb.EJBLocalObject;
import javax.ejb.RemoveException;

class Ideas_2010_10_11 {

  static final Integer FOO = 1;
  static final Integer BAR = 2;

  Integer state = FOO;

  public void setFoo() {
    state = FOO;
    state = FOO; // Duplicate assignment
  }

  public void setBar() {
    state = BAR;
    state = BAR; // Duplicate assignment
  }

  @DesireNoWarning("RC_REF_COMPARISON_BAD_PRACTICE")
  public boolean isFoo() {
    return state == FOO;
  }

  @ExpectWarning("BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY")
  public void cascadeDelete(Collection value) throws RemoveException {
    if (!value.isEmpty()) {
      EJBLocalObject[] locals = (EJBLocalObject[]) value.toArray();
      for (int i = 0; i < locals.length; ++i) {
        locals[i].remove();
      }
    }
  }
}