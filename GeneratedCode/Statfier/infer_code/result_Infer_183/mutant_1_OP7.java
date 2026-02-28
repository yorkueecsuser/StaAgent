import javax.annotation.Nullable;

/**
 * The rule: if a nullable field is non-conditionally initialized in all constructors, it is
 * overannotated.
 */
class FieldOverAnnotated {
  @Nullable String initializedInAllConstructorsIsBAD;
  // if there are branches, but the field is initilized in all branches,
  // it is still overannotated.
  @Nullable String initilizedInAllConstructorsAndAllBranchesIsBAD;
  @Nullable String initiliazedInSomeConstructorsIsOK;
  @Nullable String conditionallyInitializedIsOK;
  @Nullable String notInitializedIsOK;
  // False positive: we set it is @Nullable so this is NOT overannotated but the issue is recorded.
  @Nullable String FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK;

  FieldOverAnnotated(int a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    initializedInAllConstructorsIsBAD = "";
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = "";
    if (a == 0) {
      // We initialize it in the other constructor, but here
      // we initialize it only conditionally, hence @Nullable annotation is justified.
      conditionallyInitializedIsOK = "";
    }
    // check that initialization from both branches still counts as overannotated
    if (a == 1) {
      initilizedInAllConstructorsAndAllBranchesIsBAD = "";
    } else {
      initilizedInAllConstructorsAndAllBranchesIsBAD = "";
    }
    initiliazedInSomeConstructorsIsOK = "";
  }

  FieldOverAnnotated(int a, int b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    initializedInAllConstructorsIsBAD = "";
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = "";
    initilizedInAllConstructorsAndAllBranchesIsBAD = "";
    conditionallyInitializedIsOK = "";
  }

  public void setToNull() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    // False positive: we set it is @Nullable so this is NOT overannotated but
    // the issue is recorded.
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = null;
  }

  private boolean getCondition() {
    return false;
  }
}