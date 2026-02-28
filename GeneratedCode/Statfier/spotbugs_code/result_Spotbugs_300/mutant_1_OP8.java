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
  }

  public void setBar() {
    state = BAR;
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

  // Mutated code
  Integer x = FOO;

  public void setX() {
    x = FOO;
  }

  public void setY() {
    x = BAR;
  }

  @DesireNoWarning("RC_REF_COMPARISON_BAD_PRACTICE")
  public boolean isX() {
    return x == FOO;
  }

  @ExpectWarning("BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY")
  public void cascadeDeleteMutant(Collection v) throws RemoveException {
    if (!v.isEmpty()) {
      EJBLocalObject[] l = (EJBLocalObject[]) v.toArray();
      for (int j = 0; j < l.length; ++j) {
        l[j].remove();
      }
    }
  }
}