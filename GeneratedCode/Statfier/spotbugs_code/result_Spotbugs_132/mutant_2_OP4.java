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

    // Inserting an unreachable if-else branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return true;
    } else {
      // This block is also unreachable
      return false;
    }

    return false;
  }

  private static boolean getUnreachableCondition() {
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}

class Type {}

class BasicType extends Type {}

class ReferenceType extends Type {}