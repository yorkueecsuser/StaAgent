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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        view.setVisibility(View.GONE);
        break;
    }
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        view.setVisibility(View.VISIBLE);
        break;
    }
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        view.setVisibility(View.INVISIBLE);
        break;
    }
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        field.setVisibility(View.GONE);
        break;
    }
  }

  static void acceptsNonnullView(View view) {}

  // Helper method to simulate a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}