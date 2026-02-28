import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    return x.hashCode();
  }

  public void setY(Object y) {
    this.y = y;
  }

  // Mutated code
  @In Object a;

  @Out Object b;

  @Override
  public int hashcode() {
    return a.hashCode();
  }

  public void setB(Object b) {
    this.b = b;
  }
}