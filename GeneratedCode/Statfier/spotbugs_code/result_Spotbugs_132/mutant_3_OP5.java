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

    // Inserting an unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable for the same reason
        System.out.println("This will also never be printed");
        break;
    }

    return false;
  }

  private static boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}

class Type {}

class BasicType extends Type {}

class ReferenceType extends Type {}