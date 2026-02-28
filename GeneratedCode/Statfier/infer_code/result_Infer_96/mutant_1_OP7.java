import javax.annotation.Nullable;

/**
 * Nullsafe has a feature: field nullability is memoized within a method. In other words, nullsafe
 * assumes:
 *
 * <ol>
 *   <li>a) There will be no tricky multithreading.
 *   <li>b) If a field is set to non-null, the method won't call another method that will nullify it
 *       back.
 * </ol>
 *
 * <p>NOTE: This feature is unsound, but assumptions a) and b) mostly hold for real codebases, so
 * here nullsafe tradeoffs theoretical unsoundness for practical usability.
 *
 * <p>This class tests basic properties of this feature.
 */
class FieldNullabilityMemoization {
  private @Nullable Object nullable;

  void dereferenceIsBAD() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    nullable.toString();
  }

  void dereferenceViaLocalVarIsBAD() {
    Object a = nullable;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    a.toString();
  }

  void dereferenceAfterCheckIsOK() {
    if (nullable!= null) {
      // Theoretically, a different thread could modify the field right here.
      // But practically, if such things can happen, we have much bigger problems than nullability.
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      nullable.toString();
    }
  }

  void dereferenceAfterCheckViaLocalVarIsOK() {
    if (nullable!= null) {
      // Theoretically, a different thread could modify the field right here.
      // But practically, if such things can happen, we have much bigger problems than nullability.
      Object a = nullable;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      a.toString();
    }
  }

  void dereferenceAfterNonnullAssignmentIsOK() {
    nullable = "";
    // Theoretically, a different thread could modify the field right here.
    // But practically, if such things can happen, we have much bigger problems than nullability.
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    nullable.toString();
  }

  void dereferenceAfterNonnullAssignmentViaLocalVarIsOK() {
    nullable = "";

    // Theoretically, a different thread could modify the field right here.
    // But practically, if such things can happen, we have much bigger problems than nullability.

    Object a = nullable;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    a.toString();
  }

  void FN_nullabilityIsPreservedEvenOnMethodCalls() {
    nullable = "";

    // Calling methods does not invalidate nullability of fields,
    // even if they theoritically can nullify the field.
    // In practice, this happens extremely rarely, but in this synthetic example
    // this will lead to an NPE.
    nullify();

    // Uncaught NPE
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    nullable.toString();
  }

  private void nullify() {
    nullable = null;
  }

  private boolean getCondition() {
    return false;
  }
}