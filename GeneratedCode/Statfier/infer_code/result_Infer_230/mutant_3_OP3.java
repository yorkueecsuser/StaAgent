import android.annotation.SuppressLint;
import android.view.View;

/**
 * Test to ensure we have special messaging when misusing known nullable methods that have
 * non-nullable alternatives.
 */
class AlternativeRecommendations {
  @SuppressLint("eradicate-field-not-initialized")
  View field;

  static void dereference_ShouldSuggestAlternative(View view) {
    view.findViewById(2).setId(3);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  static void acceptsNonnullView(View view) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}