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

    // Mutant: Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  FieldOverAnnotated(int a, int b) {
    initializedInAllConstructorsIsBAD = "";
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = "";
    initilizedInAllConstructorsAndAllBranchesIsBAD = "";
    conditionallyInitializedIsOK = "";

    // Mutant: Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  public void setToNull() {
    // False positive: we set it is @Nullable so this is NOT overannotated but
    // the issue is recorded.
    FP_initializedInAllConstructorsButSetToNullInAPublicMethodShouldBeOK = null;

    // Mutant: Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}