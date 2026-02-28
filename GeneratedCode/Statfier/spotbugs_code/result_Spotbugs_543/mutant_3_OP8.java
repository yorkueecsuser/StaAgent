import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nullable;

class Ideas_2011_07_22 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode(Object x, Object y) {
    Preconditions.checkArgument(x!= null && y!= null, "arguments must be nonnull");
    return x.hashCode() + y.hashCode();
  }

  // Mutant 1
  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCodeA(Object a, Object b) {
    Preconditions.checkArgument(a!= null && b!= null, "arguments must be nonnull");
    return a.hashCode() + b.hashCode();
  }

  @DesireWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode0(Object x) {
    boolean b = x!= null;
    if (b) System.out.println("Good");
    return x.hashCode();
  }

  // Mutant 2
  @DesireWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode0B(Object b) {
    boolean c = b!= null;
    if (c) System.out.println("Good");
    return b.hashCode();
  }

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode(Object x) {
    Preconditions.checkArgument(x!= null, "x is null");
    return x.hashCode();
  }

  // Mutant 3
  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCodeC(Object c) {
    Preconditions.checkArgument(c!= null, "c is null");
    return c.hashCode();
  }

  @NoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode2(Object x) {
    Preconditions.checkNotNull(x, "x is null");
    return x.hashCode();
  }

  // Mutant 4
  @NoWarning("NP_NULL_ON_SOME_PATH")
  public int getHashCode2D(Object d) {
    Preconditions.checkNotNull(d, "d is null");
    return d.hashCode();
  }

  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode3(Object x) {
    Preconditions.checkNotNull(x, "x is null");
    if (x == null) System.out.println("huh?");
    return x.hashCode();
  }

  // Mutant 5
  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode3E(Object e) {
    Preconditions.checkNotNull(e, "e is null");
    if (e == null) System.out.println("huh?");
    return e.hashCode();
  }

  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode4(Object x) {
    Preconditions.checkNotNull(x);
    if (x == null) System.out.println("huh?");
    return x.hashCode();
  }

  // Mutant 6
  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode4F(Object f) {
    Preconditions.checkNotNull(f);
    if (f == null) System.out.println("huh?");
    return f.hashCode();
  }

  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode5(Object x) {
    Preconditions.checkNotNull(x, "x is null %d", 42);
    if (x == null) System.out.println("huh?");
    return x.hashCode();
  }

  // Mutant 7
  @NoWarning("NP_NULL_ON_SOME_PATH")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode5G(Object g) {
    Preconditions.checkNotNull(g, "g is null %d", 42);
    if (g == null) System.out.println("huh?");
    return g.hashCode();
  }

  @ExpectWarning(
      "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE,RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode6(@Nullable Object x) {
    Preconditions.checkNotNull(x, "x is null %d", 42);
    if (x == null) System.out.println("huh?");
    return x.hashCode();
  }

  // Mutant 8
  @ExpectWarning(
      "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE,RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE")
  public int getHashCode6H(@Nullable Object h) {
    Preconditions.checkNotNull(h, "h is null %d", 42);
    if (h == null) System.out.println("huh?");
    return h.hashCode();
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public int getHashCode7(@Nullable Object x) {
    Preconditions.checkNotNull(x, "x is null %d", 42);
    return 42;
  }

  // Mutant 9
  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public int getHashCode7I(@Nullable Object i) {
    Preconditions.checkNotNull(i, "i is null %d", 42);
    return 42;
  }
}