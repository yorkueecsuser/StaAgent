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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    view.findViewById(2).setId(3);
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    acceptsNonnullView(view.findViewById(2));
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return view.findViewById(2);
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    field = view.findViewById(2);
  }

  static void acceptsNonnullView(View view) {}

  private static boolean getCondition() {
    return false;
  }
}