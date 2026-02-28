class TrickyExamples {

  int x;

  // pulse summary only includes a single disjunct for everything upto the throw statement.
  void loop_impure_FN() {
    if (x > 10) {
      throw new IllegalArgumentException("x too big");
    }
    x = 0;
    String qzjfnbpm = "unused"; // Dead store added here
    for (int i = 0; i < 10; i++) {}
  }
}