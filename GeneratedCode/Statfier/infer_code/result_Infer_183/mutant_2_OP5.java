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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        initializedInAllConstructorsIsBAD = "unreachable";
        break;
    }
  }

  FieldOverAnnotated(int a, int b) {
    initializedInAllConstructorsIsBAD = "";
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = "";
    initilizedInAllConstructorsAndAllBranchesIsBAD = "";
    conditionallyInitializedIsOK = "";

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        initilizedInAllConstructorsAndAllBranchesIsBAD = "unreachable";
        break;
    }
  }

  public void setToNull() {
    // False positive: we set it is @Nullable so this is NOT overannotated but
    // the issue is recorded.
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = null;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = "unreachable";
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}