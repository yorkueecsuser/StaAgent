import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.Nonnull;

class BC_IMPOSSIBLE_INSTANCEOF {
  // seen in edu.umd.cs.findbugs.ba.IncompatibleTypes

  @ExpectWarning("BC_IMPOSSIBLE_INSTANCEOF")
  public static @Nonnull boolean getPriorityForAssumingCompatible(
      Type expectedType, Type actualType, boolean pointerEquality) {
    if (expectedType.equals(actualType)) return true;

    if (!(expectedType instanceof ReferenceType)) return true;
    if (!(actualType instanceof ReferenceType)) return true;

    if (expectedType instanceof BasicType ^ actualType instanceof BasicType) {
      return false;
    }
    return false;
  }

  // Mutated code with renaming
  @ExpectWarning("BC_IMPOSSIBLE_INSTANCEOF")
  public static @Nonnull boolean getPriorityForAssumingCompatible(
      Type x, Type y, boolean z) {
    if (x.equals(y)) return true;

    if (!(x instanceof ReferenceType)) return true;
    if (!(y instanceof ReferenceType)) return true;

    if (x instanceof BasicType ^ y instanceof BasicType) {
      return false;
    }
    return false;
  }
}

class Type {}

class BasicType extends Type {}

class ReferenceType extends Type {}