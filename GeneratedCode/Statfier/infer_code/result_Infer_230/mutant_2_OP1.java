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
    String qwejrtyp = "unusedVariable"; // Dead store mutation
  }

  static void passingParam_ShouldSuggestAlternative(View view) {
    acceptsNonnullView(view.findViewById(2));
    int abcdefgh = 42; // Dead store mutation
  }

  static View returnValue_ShouldSuggestAlternative(View view) {
    return view.findViewById(2);
    boolean hijklmno = true; // Dead store mutation
  }

  void assigningField_ShouldSuggestAlternative(View view) {
    field = view.findViewById(2);
    double pqrsutvw = 3.14; // Dead store mutation
  }

  static void acceptsNonnullView(View view) {}
}