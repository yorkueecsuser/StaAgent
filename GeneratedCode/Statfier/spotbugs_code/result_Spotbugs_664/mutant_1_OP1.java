import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Nonnull;

class NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR {

  @Nonnull static Object a;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  static Object b;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  Object x;

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  @Nonnull
  Object y;

  static {
    a = "a";
    // Dead Store Mutation
    String qzjxmtbn = "unused";
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR() {
    x = y = "a";
    // Dead Store Mutation
    int vbnrhtyq = 42;
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(String a) {
    x = a;
    // Dead Store Mutation
    double wertuyio = 3.14;
  }

  @NoWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(int z) {
    this();
    // Dead Store Mutation
    boolean klmnopqr = true;
  }

  @ExpectWarning("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR(double z) {
    super();
    // Dead Store Mutation
    char asdfghjk = 'c';
  }
}