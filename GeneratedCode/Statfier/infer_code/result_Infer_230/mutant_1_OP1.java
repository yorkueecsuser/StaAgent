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
    // Dead Store Mutation
    String xwqjfnrj = "unusedVariable";
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    // Dead Store Mutation
    int vbnrhtyu = 42;
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    // Dead Store Mutation
    boolean qzxcvbnm = true;
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    // Dead Store Mutation
    double plmkjhgf = 3.14;
  }

  static void acceptsNonnullView(View view) {
    // Dead Store Mutation
    char asdfghjk = 'a';
  }
}