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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  static void acceptsNonnullView(View view) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}