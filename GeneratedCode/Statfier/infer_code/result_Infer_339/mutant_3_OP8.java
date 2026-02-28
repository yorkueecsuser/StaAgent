class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    for (int i = 0; i < 10; i++) {}

    // Mutant code with renaming
    int y;
    if (y > 10) {
      throw new IllegalArgumentException("y too big");
    }
    y = 0;
    for (int j = 0; j < 10; j++) {}
  }
}