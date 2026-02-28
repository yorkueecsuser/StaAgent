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

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if branch.");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else branch.");
    }

    return false;
  }

  private static boolean getCondition() {
    // This method always returns false, making the if-else branch unreachable
    return false;
  }
}

class Type {}

class BasicType extends Type {}

class ReferenceType extends Type {}