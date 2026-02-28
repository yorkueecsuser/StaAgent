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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  static void acceptsNonnullView(View view) {
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}