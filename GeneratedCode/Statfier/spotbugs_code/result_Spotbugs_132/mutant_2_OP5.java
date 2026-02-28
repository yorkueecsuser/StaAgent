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

    // Inserting unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable case.");
        break;
      case false:
        // This case is also unreachable due to the same reason
        System.out.println("This is another unreachable case.");
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