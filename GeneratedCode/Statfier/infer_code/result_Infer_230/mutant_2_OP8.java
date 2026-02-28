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
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
  }

  static void acceptsNonnullView(View view) {}

  // Mutated code
  @SuppressLint("eradicate-field-not-initialized")
  View g;

  static void dereference_ShouldSuggestAlternative(View x) {
    x.findViewById(2).setId(3);
  }

  static void passingParam_ShouldSuggestAlternative(View y) {
    acceptsNonnullView(y.findViewById(2));
  }

  static View returnValue_ShouldSuggestAlternative(View z) {
    return z.findViewById(2);
  }

  void assigningField_ShouldSuggestAlternative(View w) {
    g = w.findViewById(2);
  }

  static void acceptsNonnullView(View v) {}
}